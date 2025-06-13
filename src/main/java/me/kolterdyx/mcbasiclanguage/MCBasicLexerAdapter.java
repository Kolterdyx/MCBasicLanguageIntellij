
package me.kolterdyx.mcbasiclanguage;

import com.intellij.lexer.FlexAdapter;
import me.kolterdyx.mcbasiclanguage.MCBasicLexer;

public class MCBasicLexerAdapter extends FlexAdapter {

  public MCBasicLexerAdapter() {
    super(new MCBasicLexer(null));
  }

}
