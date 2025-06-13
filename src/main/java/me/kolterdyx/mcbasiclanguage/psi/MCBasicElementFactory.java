
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

  public static PsiElement createIdentifier(Project project, String name) {
      MCBasicFile file = createFile(project, "let " + name + " int;");
      PsiElement declaration = file.getFirstChild();
      if (declaration == null) return null;

      return declaration.getFirstChild();
  }

}
