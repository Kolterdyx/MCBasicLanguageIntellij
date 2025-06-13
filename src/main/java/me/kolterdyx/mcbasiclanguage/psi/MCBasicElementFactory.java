
package me.kolterdyx.mcbasiclanguage.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import me.kolterdyx.mcbasiclanguage.MCBasicFileType;
import org.jetbrains.annotations.NotNull;

public class MCBasicElementFactory {

  public static MCBasicFile createFile(Project project, String text) {
    String name = "dummy.mcb";
    return (MCBasicFile) PsiFileFactory.getInstance(project).createFileFromText(name, MCBasicFileType.INSTANCE, text);
  }

  public static MCBasicFunctionDeclaration createFunction(Project project, String name) {
    MCBasicFile file = createFile(project, name);
    return (MCBasicFunctionDeclaration) file.getFirstChild();
  }

    public static MCBasicVariableDeclaration createVariable(Project project, String name) {
        MCBasicFile file = createFile(project, name);
        return (MCBasicVariableDeclaration) file.getFirstChild();
    }

    public static MCBasicStructDeclaration createStruct(Project project, String name) {
        MCBasicFile file = createFile(project, name);
        return (MCBasicStructDeclaration) file.getFirstChild();
    }

    public static MCBasicBaseValue createBaseValue(@NotNull Project project, String newName) {
        MCBasicFile file = createFile(project, newName);
        PsiElement firstChild = file.getFirstChild();
        if (firstChild instanceof MCBasicBaseValue) {
            return (MCBasicBaseValue) firstChild;
        } else {
            throw new IllegalArgumentException("The first child is not a valid MCBasicBaseValue");
        }
    }
}
