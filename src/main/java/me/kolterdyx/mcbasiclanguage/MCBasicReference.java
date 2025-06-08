package me.kolterdyx.mcbasiclanguage;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementResolveResult;
import com.intellij.psi.PsiPolyVariantReferenceBase;
import com.intellij.psi.ResolveResult;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicFunctionDeclaration;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class MCBasicReference extends PsiPolyVariantReferenceBase<PsiElement> {
    private final String key;

    public MCBasicReference(@NotNull PsiElement element, TextRange textRange) {
        super(element, textRange);
        this.key = element.getText().substring(textRange.getStartOffset(), textRange.getEndOffset());
    }

    @Override
    public ResolveResult @NotNull [] multiResolve(boolean incompleteCode) {
        Project project = myElement.getProject();
        List<MCBasicFunctionDeclaration> functions = MCBasicUtil.findFunctions(project, key);
        List<ResolveResult> results = new ArrayList<>();
        for (MCBasicFunctionDeclaration function : functions) {
            results.add(new PsiElementResolveResult(function));
        }
        return results.toArray(new ResolveResult[0]);
    }

    @Override
    public Object @NotNull [] getVariants() {
        Project project = myElement.getProject();
        List<MCBasicFunctionDeclaration> functions = MCBasicUtil.findFunctions(project);
        List<LookupElement> variants = new ArrayList<>();
        for (MCBasicFunctionDeclaration function : functions) {
            if (function.getName() != null && !function.getName().isEmpty()) {
                variants.add(LookupElementBuilder
                        .create(function).withIcon(MCBasicIcons.FILE)
                        .withTypeText(function.getContainingFile().getName())
                );
            }
        }
        return variants.toArray();
    }
}
