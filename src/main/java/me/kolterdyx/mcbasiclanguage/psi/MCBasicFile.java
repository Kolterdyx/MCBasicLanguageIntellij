
package me.kolterdyx.mcbasiclanguage.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import me.kolterdyx.mcbasiclanguage.MCBasicFileType;
import me.kolterdyx.mcbasiclanguage.MCBasicLanguage;
import org.jetbrains.annotations.NotNull;

public class MCBasicFile extends PsiFileBase {

  public MCBasicFile(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, MCBasicLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public FileType getFileType() {
    return MCBasicFileType.INSTANCE;
  }

  @Override
  public String toString() {
    return "MCBasic File";
  }

}
