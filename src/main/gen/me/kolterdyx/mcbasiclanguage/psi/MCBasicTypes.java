// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import me.kolterdyx.mcbasiclanguage.psi.impl.*;

public interface MCBasicTypes {

  IElementType FUNCTION_CALL = new MCBasicElementType("FUNCTION_CALL");
  IElementType MEMBER_ACCESS = new MCBasicElementType("MEMBER_ACCESS");
  IElementType OP_DIVIDE = new MCBasicElementType("OP_DIVIDE");
  IElementType OP_EQUAL = new MCBasicElementType("OP_EQUAL");
  IElementType OP_GREATER = new MCBasicElementType("OP_GREATER");
  IElementType OP_GREATER_EQUAL = new MCBasicElementType("OP_GREATER_EQUAL");
  IElementType OP_LESS = new MCBasicElementType("OP_LESS");
  IElementType OP_LESS_EQUAL = new MCBasicElementType("OP_LESS_EQUAL");
  IElementType OP_MINUS = new MCBasicElementType("OP_MINUS");
  IElementType OP_MODULO = new MCBasicElementType("OP_MODULO");
  IElementType OP_MULTIPLY = new MCBasicElementType("OP_MULTIPLY");
  IElementType OP_NOT_EQUAL = new MCBasicElementType("OP_NOT_EQUAL");
  IElementType OP_PLUS = new MCBasicElementType("OP_PLUS");
  IElementType PUNCTUATION_COMMA = new MCBasicElementType("PUNCTUATION_COMMA");
  IElementType PUNCTUATION_DOT = new MCBasicElementType("PUNCTUATION_DOT");
  IElementType PUNCTUATION_LBRACE = new MCBasicElementType("PUNCTUATION_LBRACE");
  IElementType PUNCTUATION_LBRACKET = new MCBasicElementType("PUNCTUATION_LBRACKET");
  IElementType PUNCTUATION_LPAREN = new MCBasicElementType("PUNCTUATION_LPAREN");
  IElementType PUNCTUATION_RBRACE = new MCBasicElementType("PUNCTUATION_RBRACE");
  IElementType PUNCTUATION_RBRACKET = new MCBasicElementType("PUNCTUATION_RBRACKET");
  IElementType PUNCTUATION_RPAREN = new MCBasicElementType("PUNCTUATION_RPAREN");
  IElementType PUNCTUATION_SEMICOLON = new MCBasicElementType("PUNCTUATION_SEMICOLON");
  IElementType STATEMENT = new MCBasicElementType("STATEMENT");

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
  IElementType OP_NOT = new MCBasicTokenType("OP_NOT");
  IElementType OP_OR = new MCBasicTokenType("OP_OR");
  IElementType STRING_LITERAL = new MCBasicTokenType("STRING_LITERAL");
  IElementType TRUE_LITERAL = new MCBasicTokenType("TRUE_LITERAL");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == FUNCTION_CALL) {
        return new MCBasicFunctionCallImpl(node);
      }
      else if (type == MEMBER_ACCESS) {
        return new MCBasicMemberAccessImpl(node);
      }
      else if (type == OP_DIVIDE) {
        return new MCBasicOpDivideImpl(node);
      }
      else if (type == OP_EQUAL) {
        return new MCBasicOpEqualImpl(node);
      }
      else if (type == OP_GREATER) {
        return new MCBasicOpGreaterImpl(node);
      }
      else if (type == OP_GREATER_EQUAL) {
        return new MCBasicOpGreaterEqualImpl(node);
      }
      else if (type == OP_LESS) {
        return new MCBasicOpLessImpl(node);
      }
      else if (type == OP_LESS_EQUAL) {
        return new MCBasicOpLessEqualImpl(node);
      }
      else if (type == OP_MINUS) {
        return new MCBasicOpMinusImpl(node);
      }
      else if (type == OP_MODULO) {
        return new MCBasicOpModuloImpl(node);
      }
      else if (type == OP_MULTIPLY) {
        return new MCBasicOpMultiplyImpl(node);
      }
      else if (type == OP_NOT_EQUAL) {
        return new MCBasicOpNotEqualImpl(node);
      }
      else if (type == OP_PLUS) {
        return new MCBasicOpPlusImpl(node);
      }
      else if (type == PUNCTUATION_COMMA) {
        return new MCBasicPunctuationCommaImpl(node);
      }
      else if (type == PUNCTUATION_DOT) {
        return new MCBasicPunctuationDotImpl(node);
      }
      else if (type == PUNCTUATION_LBRACE) {
        return new MCBasicPunctuationLbraceImpl(node);
      }
      else if (type == PUNCTUATION_LBRACKET) {
        return new MCBasicPunctuationLbracketImpl(node);
      }
      else if (type == PUNCTUATION_LPAREN) {
        return new MCBasicPunctuationLparenImpl(node);
      }
      else if (type == PUNCTUATION_RBRACE) {
        return new MCBasicPunctuationRbraceImpl(node);
      }
      else if (type == PUNCTUATION_RBRACKET) {
        return new MCBasicPunctuationRbracketImpl(node);
      }
      else if (type == PUNCTUATION_RPAREN) {
        return new MCBasicPunctuationRparenImpl(node);
      }
      else if (type == PUNCTUATION_SEMICOLON) {
        return new MCBasicPunctuationSemicolonImpl(node);
      }
      else if (type == STATEMENT) {
        return new MCBasicStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
