// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import me.kolterdyx.mcbasiclanguage.psi.impl.*;

public interface MCBasicTypes {

  IElementType PROPERTY = new MCBasicElementType("PROPERTY");

  IElementType COMMENT = new MCBasicTokenType("COMMENT");
  IElementType CRLF = new MCBasicTokenType("CRLF");
  IElementType KEY = new MCBasicTokenType("KEY");
  IElementType SEPARATOR = new MCBasicTokenType("SEPARATOR");
  IElementType VALUE = new MCBasicTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new MCBasicPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
