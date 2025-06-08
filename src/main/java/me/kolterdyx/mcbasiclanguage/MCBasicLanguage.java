package me.kolterdyx.mcbasiclanguage;

import com.intellij.lang.Language;

public class MCBasicLanguage extends Language {

  public static final MCBasicLanguage INSTANCE = new MCBasicLanguage();

  private MCBasicLanguage() {
    super("MCBasic");
  }

}
