package me.kolterdyx.mcbasiclanguage;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicElement;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicNamedElement;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicPlainImport;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class MCBasicUtil {

    public static List<MCBasicNamedElement> findLocalSymbols(Project project, PsiFile containingFile, String name) {
        return MCBasicSymbolIndex.INSTANCE.get(name, project, GlobalSearchScope.fileScope(containingFile))
                .stream()
                .filter(element -> PsiTreeUtil.getParentOfType(element, MCBasicNamedElement.class) != null)
                .toList();
    }

    public static MCBasicPlainImport findImportedSymbols(Project project, MCBasicElement myElement, String name) {
        PsiFile containingFile = myElement.getContainingFile();
        Collection<MCBasicPlainImport> imports = MCBasicSymbolIndex.INSTANCE.get(name, project, GlobalSearchScope.fileScope(containingFile))
                .stream()
                .filter(element -> PsiTreeUtil.getParentOfType(element, MCBasicPlainImport.class) != null)
                .map(element -> PsiTreeUtil.getParentOfType(element, MCBasicPlainImport.class))
                .toList();
        for (MCBasicPlainImport importStmt : imports) {
            if (Objects.equals(importStmt.getName(), name)) {
                return importStmt;
            }
        }
        return null;
    }

    @Nullable
    public static PsiFile resolveImportedFile(String path, Project project) {
        VirtualFile file = LocalFileSystem.getInstance().findFileByPath(path);
        return file != null ? PsiManager.getInstance(project).findFile(file) : null;
    }
}
