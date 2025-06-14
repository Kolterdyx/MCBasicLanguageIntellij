// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import me.kolterdyx.mcbasiclanguage.stub.impl.MCBasicFunctionDeclarationStubElementType;
import me.kolterdyx.mcbasiclanguage.stub.impl.MCBasicParameterStubElementType;
import me.kolterdyx.mcbasiclanguage.stub.impl.MCBasicPlainImportStubElementType;
import me.kolterdyx.mcbasiclanguage.stub.impl.MCBasicStructDeclarationStubElementType;
import me.kolterdyx.mcbasiclanguage.stub.impl.MCBasicVariableDeclarationStubElementType;
import me.kolterdyx.mcbasiclanguage.psi.impl.*;

public interface MCBasicTypes {

  IElementType ALIASED_IMPORT = new MCBasicElementType("ALIASED_IMPORT");
  IElementType BASE_VALUE = new MCBasicElementType("BASE_VALUE");
  IElementType FUNCTION_DECLARATION = new MCBasicFunctionDeclarationStubElementType("FUNCTION_DECLARATION");
  IElementType IDENTIFIER_TYPE = new MCBasicElementType("IDENTIFIER_TYPE");
  IElementType IMPORT_PATH = new MCBasicElementType("IMPORT_PATH");
  IElementType IMPORT_STATEMENT = new MCBasicElementType("IMPORT_STATEMENT");
  IElementType PARAMETER = new MCBasicParameterStubElementType("PARAMETER");
  IElementType PLAIN_IMPORT = new MCBasicPlainImportStubElementType("PLAIN_IMPORT");
  IElementType STATEMENT = new MCBasicElementType("STATEMENT");
  IElementType STRUCT_DECLARATION = new MCBasicStructDeclarationStubElementType("STRUCT_DECLARATION");
  IElementType VARIABLE_DECLARATION = new MCBasicVariableDeclarationStubElementType("VARIABLE_DECLARATION");

  IElementType COMMENT = new MCBasicTokenType("COMMENT");
  IElementType DOUBLE_LITERAL = new MCBasicTokenType("DOUBLE_LITERAL");
  IElementType FALSE_LITERAL = new MCBasicTokenType("FALSE_LITERAL");
  IElementType IDENTIFIER = new MCBasicTokenType("IDENTIFIER");
  IElementType INTEGER_LITERAL = new MCBasicTokenType("INTEGER_LITERAL");
  IElementType KEYWORD_AS = new MCBasicTokenType("as");
  IElementType KEYWORD_DOUBLE = new MCBasicTokenType("double");
  IElementType KEYWORD_ELSE = new MCBasicTokenType("else");
  IElementType KEYWORD_EXEC = new MCBasicTokenType("exec");
  IElementType KEYWORD_FROM = new MCBasicTokenType("from");
  IElementType KEYWORD_FUNC = new MCBasicTokenType("func");
  IElementType KEYWORD_IF = new MCBasicTokenType("if");
  IElementType KEYWORD_IMPORT = new MCBasicTokenType("import");
  IElementType KEYWORD_INT = new MCBasicTokenType("int");
  IElementType KEYWORD_LET = new MCBasicTokenType("let");
  IElementType KEYWORD_RETURN = new MCBasicTokenType("return");
  IElementType KEYWORD_STR = new MCBasicTokenType("str");
  IElementType KEYWORD_STRUCT = new MCBasicTokenType("struct");
  IElementType NEWLINE = new MCBasicTokenType("NEWLINE");
  IElementType OP_AND = new MCBasicTokenType("and");
  IElementType OP_ASSIGN = new MCBasicTokenType("=");
  IElementType OP_EQUAL = new MCBasicTokenType("==");
  IElementType OP_GREATER = new MCBasicTokenType(">");
  IElementType OP_GREATER_EQUAL = new MCBasicTokenType(">=");
  IElementType OP_LESS = new MCBasicTokenType("<");
  IElementType OP_LESS_EQUAL = new MCBasicTokenType("<=");
  IElementType OP_MINUS = new MCBasicTokenType("-");
  IElementType OP_NOT = new MCBasicTokenType("!");
  IElementType OP_NOT_EQUAL = new MCBasicTokenType("!=");
  IElementType OP_OR = new MCBasicTokenType("or");
  IElementType OP_PERCENT = new MCBasicTokenType("%");
  IElementType OP_PLUS = new MCBasicTokenType("+");
  IElementType OP_SLASH = new MCBasicTokenType("/");
  IElementType OP_STAR = new MCBasicTokenType("*");
  IElementType PUNCTUATION_BRACE_CLOSE = new MCBasicTokenType("}");
  IElementType PUNCTUATION_BRACE_OPEN = new MCBasicTokenType("{");
  IElementType PUNCTUATION_BRACKET_CLOSE = new MCBasicTokenType("]");
  IElementType PUNCTUATION_BRACKET_OPEN = new MCBasicTokenType("[");
  IElementType PUNCTUATION_COMMA = new MCBasicTokenType(",");
  IElementType PUNCTUATION_DOT = new MCBasicTokenType(".");
  IElementType PUNCTUATION_PAREN_CLOSE = new MCBasicTokenType(")");
  IElementType PUNCTUATION_PAREN_OPEN = new MCBasicTokenType("(");
  IElementType PUNCTUATION_SEMICOLON = new MCBasicTokenType(";");
  IElementType STRING_LITERAL = new MCBasicTokenType("STRING_LITERAL");
  IElementType TRUE_LITERAL = new MCBasicTokenType("TRUE_LITERAL");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ALIASED_IMPORT) {
        return new MCBasicAliasedImportImpl(node);
      }
      else if (type == BASE_VALUE) {
        return new MCBasicBaseValueImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new MCBasicFunctionDeclarationImpl(node);
      }
      else if (type == IDENTIFIER_TYPE) {
        return new MCBasicIdentifierTypeImpl(node);
      }
      else if (type == IMPORT_PATH) {
        return new MCBasicImportPathImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new MCBasicImportStatementImpl(node);
      }
      else if (type == PARAMETER) {
        return new MCBasicParameterImpl(node);
      }
      else if (type == PLAIN_IMPORT) {
        return new MCBasicPlainImportImpl(node);
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
