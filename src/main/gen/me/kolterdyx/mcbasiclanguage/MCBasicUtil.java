package me.kolterdyx.mcbasiclanguage;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicFile;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicFunctionDeclaration;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MCBasicUtil {

    public static List<MCBasicFunctionDeclaration> findFunctions(Project project, String functionName) {
        List<MCBasicFunctionDeclaration> functions = new ArrayList<>();
        Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(MCBasicFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            MCBasicFile mcbasicFile = (MCBasicFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (mcbasicFile != null) {
                MCBasicFunctionDeclaration[] functionDeclarations = PsiTreeUtil.getChildrenOfType(mcbasicFile, MCBasicFunctionDeclaration.class);
                if (functionDeclarations != null) {
                    for (MCBasicFunctionDeclaration functionDeclaration : functionDeclarations) {
                        if (functionDeclaration.getName() != null && functionDeclaration.getName().equals(functionName)) {
                            functions.add(functionDeclaration);
                        }
                    }
                }
            }
        }
        return functions;
    }

    public static List<MCBasicFunctionDeclaration> findFunctions(Project project) {
        List<MCBasicFunctionDeclaration> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(MCBasicFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            MCBasicFile simpleFile = (MCBasicFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                MCBasicFunctionDeclaration[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, MCBasicFunctionDeclaration.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }
}
