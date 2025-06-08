// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import me.kolterdyx.mcbasiclanguage.psi.impl.*;

public interface MCBasicTypes {

  IElementType BASE_VALUE = new MCBasicElementType("BASE_VALUE");
  IElementType FUNCTION_DECLARATION = new MCBasicElementType("FUNCTION_DECLARATION");
  IElementType STATEMENT = new MCBasicElementType("STATEMENT");
  IElementType STRUCT_DECLARATION = new MCBasicElementType("STRUCT_DECLARATION");
  IElementType VARIABLE_DECLARATION = new MCBasicElementType("VARIABLE_DECLARATION");

  IElementType COMMENT = new MCBasicTokenType("COMMENT");
  IElementType DOUBLE_LITERAL = new MCBasicTokenType("DOUBLE_LITERAL");
  IElementType FALSE_LITERAL = new MCBasicTokenType("FALSE_LITERAL");
  IElementType IDENTIFIER = new MCBasicTokenType("IDENTIFIER");
  IElementType INTEGER_LITERAL = new MCBasicTokenType("INTEGER_LITERAL");
  IElementType KEYWORD_AS = new MCBasicTokenType("KEYWORD_AS");
  IElementType KEYWORD_DOUBLE = new MCBasicTokenType("KEYWORD_DOUBLE");
  IElementType KEYWORD_ELSE = new MCBasicTokenType("KEYWORD_ELSE");
  IElementType KEYWORD_EXEC = new MCBasicTokenType("KEYWORD_EXEC");
  IElementType KEYWORD_FROM = new MCBasicTokenType("KEYWORD_FROM");
  IElementType KEYWORD_FUNC = new MCBasicTokenType("KEYWORD_FUNC");
  IElementType KEYWORD_IF = new MCBasicTokenType("KEYWORD_IF");
  IElementType KEYWORD_IMPORT = new MCBasicTokenType("KEYWORD_IMPORT");
  IElementType KEYWORD_INT = new MCBasicTokenType("KEYWORD_INT");
  IElementType KEYWORD_LET = new MCBasicTokenType("KEYWORD_LET");
  IElementType KEYWORD_RETURN = new MCBasicTokenType("KEYWORD_RETURN");
  IElementType KEYWORD_STR = new MCBasicTokenType("KEYWORD_STR");
  IElementType KEYWORD_STRUCT = new MCBasicTokenType("KEYWORD_STRUCT");
  IElementType NEWLINE = new MCBasicTokenType("NEWLINE");
  IElementType OP_AND = new MCBasicTokenType("OP_AND");
  IElementType OP_ASSIGN = new MCBasicTokenType("OP_ASSIGN");
  IElementType OP_DIVIDE = new MCBasicTokenType("OP_DIVIDE");
  IElementType OP_EQUAL = new MCBasicTokenType("OP_EQUAL");
  IElementType OP_GREATER = new MCBasicTokenType("OP_GREATER");
  IElementType OP_GREATER_EQUAL = new MCBasicTokenType("OP_GREATER_EQUAL");
  IElementType OP_LESS = new MCBasicTokenType("OP_LESS");
  IElementType OP_LESS_EQUAL = new MCBasicTokenType("OP_LESS_EQUAL");
  IElementType OP_MINUS = new MCBasicTokenType("OP_MINUS");
  IElementType OP_MODULO = new MCBasicTokenType("OP_MODULO");
  IElementType OP_MULTIPLY = new MCBasicTokenType("OP_MULTIPLY");
  IElementType OP_NOT = new MCBasicTokenType("OP_NOT");
  IElementType OP_NOT_EQUAL = new MCBasicTokenType("OP_NOT_EQUAL");
  IElementType OP_OR = new MCBasicTokenType("OP_OR");
  IElementType OP_PLUS = new MCBasicTokenType("OP_PLUS");
  IElementType PUNCTUATION_COMMA = new MCBasicTokenType("PUNCTUATION_COMMA");
  IElementType PUNCTUATION_DOT = new MCBasicTokenType("PUNCTUATION_DOT");
  IElementType PUNCTUATION_LBRACE = new MCBasicTokenType("PUNCTUATION_LBRACE");
  IElementType PUNCTUATION_LBRACKET = new MCBasicTokenType("PUNCTUATION_LBRACKET");
  IElementType PUNCTUATION_LPAREN = new MCBasicTokenType("PUNCTUATION_LPAREN");
  IElementType PUNCTUATION_RBRACE = new MCBasicTokenType("PUNCTUATION_RBRACE");
  IElementType PUNCTUATION_RBRACKET = new MCBasicTokenType("PUNCTUATION_RBRACKET");
  IElementType PUNCTUATION_RPAREN = new MCBasicTokenType("PUNCTUATION_RPAREN");
  IElementType PUNCTUATION_SEMICOLON = new MCBasicTokenType("PUNCTUATION_SEMICOLON");
  IElementType STRING_LITERAL = new MCBasicTokenType("STRING_LITERAL");
  IElementType TRUE_LITERAL = new MCBasicTokenType("TRUE_LITERAL");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BASE_VALUE) {
        return new MCBasicBaseValueImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new MCBasicFunctionDeclarationImpl(node);
      }
      else if (type == STATEMENT) {
        return new MCBasicStatementImpl(node);
      }
      else if (type == STRUCT_DECLARATION) {
        return new MCBasicStructDeclarationImpl(node);
      }
      else if (type == VARIABLE_DECLARATION) {
        return new MCBasicVariableDeclarationImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
