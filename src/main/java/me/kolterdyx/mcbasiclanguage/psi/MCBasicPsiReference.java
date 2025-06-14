package me.kolterdyx.mcbasiclanguage.psi;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.psi.search.GlobalSearchScope;
import me.kolterdyx.mcbasiclanguage.MCBasicSymbolIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import me.kolterdyx.mcbasiclanguage.MCBasicUtil;

import java.util.List;


public class MCBasicPsiReference extends PsiReferenceBase<MCBasicElement> {

    public MCBasicPsiReference(@NotNull MCBasicElement element) {
        super(element, new TextRange(0, element.getTextLength()));
    }

    @Override
    public @Nullable PsiElement resolve() {
        String name = getValue();
        Project project = myElement.getProject();
        // 1. Try resolving locally first
        PsiFile containingFile = myElement.getContainingFile();
        List<MCBasicNamedElement> localSymbols = MCBasicUtil.findLocalSymbols(project, containingFile, name);
        if (!localSymbols.isEmpty()) {
            return localSymbols.getFirst(); // Use local declaration
        }

        // 2. Try resolving through imports/aliases
        MCBasicPlainImport importStmt = MCBasicUtil.findImportedSymbols(project, myElement, name);
        if (importStmt != null) {
            String importedFile = importStmt.getImportPath();
            // Resolve from imported file using stub index or file PSI
            PsiFile importedPsiFile = MCBasicUtil.resolveImportedFile(importedFile, project);
            if (importedPsiFile != null) {
                List<MCBasicNamedElement> symbols = MCBasicUtil.findLocalSymbols(project, importedPsiFile, importStmt.getName());
                if (!symbols.isEmpty()) {
                    return symbols.getFirst();
                }
            }
        }

        return MCBasicSymbolIndex.INSTANCE.get(name, project, GlobalSearchScope.allScope(project))
                .stream().findFirst().orElse(null);

    }

    @Override
    public Object @NotNull [] getVariants() {
        Project project = myElement.getProject();
        return MCBasicSymbolIndex.INSTANCE.getAllKeys(project).toArray();
    }
}