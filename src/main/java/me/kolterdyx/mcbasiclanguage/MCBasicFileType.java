
package me.kolterdyx.mcbasiclanguage;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class MCBasicFileType extends LanguageFileType {

  public static final MCBasicFileType INSTANCE = new MCBasicFileType();

  private MCBasicFileType() {
    super(MCBasicLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "MCBasic File";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "MCBasic language file";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "mcb";
  }

  @Override
  public Icon getIcon() {
    return MCBasicIcons.FILE;
  }

}
