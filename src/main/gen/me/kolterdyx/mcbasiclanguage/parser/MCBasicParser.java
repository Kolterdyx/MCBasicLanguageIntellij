// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static me.kolterdyx.mcbasiclanguage.psi.MCBasicTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MCBasicParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return mcbasicFile(b, l + 1);
  }

  /* ********************************************************** */
  // OP_PLUS
  //                             | OP_MINUS
  static boolean ADDITIVE_OPERATORS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ADDITIVE_OPERATORS")) return false;
    if (!nextTokenIs(b, "", OP_MINUS, OP_PLUS)) return false;
    boolean r;
    r = consumeToken(b, OP_PLUS);
    if (!r) r = consumeToken(b, OP_MINUS);
    return r;
  }

  /* ********************************************************** */
  // OP_EQUAL
  //                             | OP_NOT_EQUAL
  static boolean EQ_OPERATORS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EQ_OPERATORS")) return false;
    if (!nextTokenIs(b, "", OP_EQUAL, OP_NOT_EQUAL)) return false;
    boolean r;
    r = consumeToken(b, OP_EQUAL);
    if (!r) r = consumeToken(b, OP_NOT_EQUAL);
    return r;
  }

  /* ********************************************************** */
  // PUNCTUATION_LBRACKET argumentList PUNCTUATION_RBRACKET
  static boolean LIST_LITERAL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LIST_LITERAL")) return false;
    if (!nextTokenIs(b, PUNCTUATION_LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PUNCTUATION_LBRACKET);
    r = r && argumentList(b, l + 1);
    r = r && consumeToken(b, PUNCTUATION_RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_MULTIPLY
  //                                     | OP_DIVIDE
  //                                     | OP_MODULO
  static boolean MULTIPLICATIVE_OPERATORS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTIPLICATIVE_OPERATORS")) return false;
    boolean r;
    r = consumeToken(b, OP_MULTIPLY);
    if (!r) r = consumeToken(b, OP_DIVIDE);
    if (!r) r = consumeToken(b, OP_MODULO);
    return r;
  }

  /* ********************************************************** */
  // OP_LESS
  //                            | OP_GREATER
  //                            | OP_LESS_EQUAL
  //                            | OP_GREATER_EQUAL
  static boolean RELATIONAL_OPERATORS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RELATIONAL_OPERATORS")) return false;
    boolean r;
    r = consumeToken(b, OP_LESS);
    if (!r) r = consumeToken(b, OP_GREATER);
    if (!r) r = consumeToken(b, OP_LESS_EQUAL);
    if (!r) r = consumeToken(b, OP_GREATER_EQUAL);
    return r;
  }

  /* ********************************************************** */
  // OP_NOT
  //                              | OP_MINUS
  static boolean UNARY_OPERATORS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNARY_OPERATORS")) return false;
    if (!nextTokenIs(b, "", OP_MINUS, OP_NOT)) return false;
    boolean r;
    r = consumeToken(b, OP_NOT);
    if (!r) r = consumeToken(b, OP_MINUS);
    return r;
  }

  /* ********************************************************** */
  // multiplicative (ADDITIVE_OPERATORS multiplicative)*
  static boolean additive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiplicative(b, l + 1);
    r = r && additive_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ADDITIVE_OPERATORS multiplicative)*
  private static boolean additive_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!additive_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "additive_1", c)) break;
    }
    return true;
  }

  // ADDITIVE_OPERATORS multiplicative
  private static boolean additive_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ADDITIVE_OPERATORS(b, l + 1);
    r = r && multiplicative(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // equality (OP_AND equality)*
  static boolean and(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = equality(b, l + 1);
    r = r && and_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_AND equality)*
  private static boolean and_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!and_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "and_1", c)) break;
    }
    return true;
  }

  // OP_AND equality
  private static boolean and_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_AND);
    r = r && equality(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression (PUNCTUATION_COMMA expression)* PUNCTUATION_COMMA?
  static boolean argumentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && argumentList_1(b, l + 1);
    r = r && argumentList_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (PUNCTUATION_COMMA expression)*
  private static boolean argumentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!argumentList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "argumentList_1", c)) break;
    }
    return true;
  }

  // PUNCTUATION_COMMA expression
  private static boolean argumentList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PUNCTUATION_COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PUNCTUATION_COMMA?
  private static boolean argumentList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_2")) return false;
    consumeToken(b, PUNCTUATION_COMMA);
    return true;
  }

  /* ********************************************************** */
  // PUNCTUATION_LBRACKET expression PUNCTUATION_RBRACKET
  static boolean arrayAccess(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayAccess")) return false;
    if (!nextTokenIs(b, PUNCTUATION_LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PUNCTUATION_LBRACKET);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, PUNCTUATION_RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_INT
  //                      | KEYWORD_STR
  //                      | KEYWORD_DOUBLE
  //                      | IDENTIFIER
  static boolean baseType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseType")) return false;
    boolean r;
    r = consumeToken(b, KEYWORD_INT);
    if (!r) r = consumeToken(b, KEYWORD_STR);
    if (!r) r = consumeToken(b, KEYWORD_DOUBLE);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | primary
  public static boolean baseValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, BASE_VALUE, "<base value>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = primary(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PUNCTUATION_LBRACE statement* PUNCTUATION_RBRACE
  static boolean blockStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStatement")) return false;
    if (!nextTokenIs(b, PUNCTUATION_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PUNCTUATION_LBRACE);
    r = r && blockStatement_1(b, l + 1);
    r = r && consumeToken(b, PUNCTUATION_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement*
  private static boolean blockStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStatement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "blockStatement_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // relational (EQ_OPERATORS relational)*
  static boolean equality(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relational(b, l + 1);
    r = r && equality_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (EQ_OPERATORS relational)*
  private static boolean equality_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!equality_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "equality_1", c)) break;
    }
    return true;
  }

  // EQ_OPERATORS relational
  private static boolean equality_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EQ_OPERATORS(b, l + 1);
    r = r && relational(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_EXEC expression PUNCTUATION_SEMICOLON
  static boolean execStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "execStatement")) return false;
    if (!nextTokenIs(b, KEYWORD_EXEC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_EXEC);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, PUNCTUATION_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // or
  static boolean expression(PsiBuilder b, int l) {
    return or(b, l + 1);
  }

  /* ********************************************************** */
  // expression PUNCTUATION_SEMICOLON
  static boolean expressionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionStatement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && consumeToken(b, PUNCTUATION_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PUNCTUATION_LPAREN argumentList? PUNCTUATION_RPAREN
  static boolean functionCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall")) return false;
    if (!nextTokenIs(b, PUNCTUATION_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PUNCTUATION_LPAREN);
    r = r && functionCall_1(b, l + 1);
    r = r && consumeToken(b, PUNCTUATION_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // argumentList?
  private static boolean functionCall_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_1")) return false;
    argumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_FUNC IDENTIFIER PUNCTUATION_LPAREN parameterList? PUNCTUATION_RPAREN blockStatement
  public static boolean functionDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration")) return false;
    if (!nextTokenIs(b, KEYWORD_FUNC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_FUNC, IDENTIFIER, PUNCTUATION_LPAREN);
    r = r && functionDeclaration_3(b, l + 1);
    r = r && consumeToken(b, PUNCTUATION_RPAREN);
    r = r && blockStatement(b, l + 1);
    exit_section_(b, m, FUNCTION_DECLARATION, r);
    return r;
  }

  // parameterList?
  private static boolean functionDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_3")) return false;
    parameterList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_IF PUNCTUATION_LPAREN expression PUNCTUATION_RPAREN blockStatement (KEYWORD_ELSE blockStatement | ifStatement)?
  static boolean ifStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement")) return false;
    if (!nextTokenIs(b, KEYWORD_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_IF, PUNCTUATION_LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, PUNCTUATION_RPAREN);
    r = r && blockStatement(b, l + 1);
    r = r && ifStatement_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KEYWORD_ELSE blockStatement | ifStatement)?
  private static boolean ifStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5")) return false;
    ifStatement_5_0(b, l + 1);
    return true;
  }

  // KEYWORD_ELSE blockStatement | ifStatement
  private static boolean ifStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ifStatement_5_0_0(b, l + 1);
    if (!r) r = ifStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KEYWORD_ELSE blockStatement
  private static boolean ifStatement_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_ELSE);
    r = r && blockStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_IMPORT (OP_MULTIPLY | IDENTIFIER (KEYWORD_AS IDENTIFIER)?) KEYWORD_FROM STRING_LITERAL PUNCTUATION_SEMICOLON
  static boolean importStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStatement")) return false;
    if (!nextTokenIs(b, KEYWORD_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_IMPORT);
    r = r && importStatement_1(b, l + 1);
    r = r && consumeTokens(b, 0, KEYWORD_FROM, STRING_LITERAL, PUNCTUATION_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_MULTIPLY | IDENTIFIER (KEYWORD_AS IDENTIFIER)?
  private static boolean importStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_MULTIPLY);
    if (!r) r = importStatement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER (KEYWORD_AS IDENTIFIER)?
  private static boolean importStatement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStatement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && importStatement_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KEYWORD_AS IDENTIFIER)?
  private static boolean importStatement_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStatement_1_1_1")) return false;
    importStatement_1_1_1_0(b, l + 1);
    return true;
  }

  // KEYWORD_AS IDENTIFIER
  private static boolean importStatement_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStatement_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_AS, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (statement|COMMENT|NEWLINE)+
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = item__0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!item__0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "item_", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // statement|COMMENT|NEWLINE
  private static boolean item__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item__0")) return false;
    boolean r;
    r = statement(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, NEWLINE);
    return r;
  }

  /* ********************************************************** */
  // baseType PUNCTUATION_LBRACKET PUNCTUATION_RBRACKET
  static boolean listType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listType")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = baseType(b, l + 1);
    r = r && consumeTokens(b, 0, PUNCTUATION_LBRACKET, PUNCTUATION_RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL
  //                 | INTEGER_LITERAL
  //                 | DOUBLE_LITERAL
  //                 | TRUE_LITERAL
  //                 | FALSE_LITERAL
  //                 | LIST_LITERAL
  static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = consumeToken(b, DOUBLE_LITERAL);
    if (!r) r = consumeToken(b, TRUE_LITERAL);
    if (!r) r = consumeToken(b, FALSE_LITERAL);
    if (!r) r = LIST_LITERAL(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean mcbasicFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mcbasicFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mcbasicFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // PUNCTUATION_DOT IDENTIFIER
  static boolean memberAccess(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberAccess")) return false;
    if (!nextTokenIs(b, PUNCTUATION_DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PUNCTUATION_DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // unary (MULTIPLICATIVE_OPERATORS unary)*
  static boolean multiplicative(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unary(b, l + 1);
    r = r && multiplicative_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (MULTIPLICATIVE_OPERATORS unary)*
  private static boolean multiplicative_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!multiplicative_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multiplicative_1", c)) break;
    }
    return true;
  }

  // MULTIPLICATIVE_OPERATORS unary
  private static boolean multiplicative_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MULTIPLICATIVE_OPERATORS(b, l + 1);
    r = r && unary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // and (OP_OR and)*
  static boolean or(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = and(b, l + 1);
    r = r && or_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_OR and)*
  private static boolean or_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!or_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "or_1", c)) break;
    }
    return true;
  }

  // OP_OR and
  private static boolean or_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_OR);
    r = r && and(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (PUNCTUATION_COMMA IDENTIFIER)* PUNCTUATION_COMMA?
  static boolean parameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && parameterList_1(b, l + 1);
    r = r && parameterList_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (PUNCTUATION_COMMA IDENTIFIER)*
  private static boolean parameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameterList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameterList_1", c)) break;
    }
    return true;
  }

  // PUNCTUATION_COMMA IDENTIFIER
  private static boolean parameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PUNCTUATION_COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // PUNCTUATION_COMMA?
  private static boolean parameterList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_2")) return false;
    consumeToken(b, PUNCTUATION_COMMA);
    return true;
  }

  /* ********************************************************** */
  // arrayAccess | functionCall | memberAccess
  static boolean postFix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postFix")) return false;
    boolean r;
    r = arrayAccess(b, l + 1);
    if (!r) r = functionCall(b, l + 1);
    if (!r) r = memberAccess(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // literal | PUNCTUATION_LPAREN expression PUNCTUATION_RPAREN
  static boolean primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = literal(b, l + 1);
    if (!r) r = primary_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PUNCTUATION_LPAREN expression PUNCTUATION_RPAREN
  private static boolean primary_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PUNCTUATION_LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, PUNCTUATION_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // additive (RELATIONAL_OPERATORS additive)*
  static boolean relational(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additive(b, l + 1);
    r = r && relational_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (RELATIONAL_OPERATORS additive)*
  private static boolean relational_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!relational_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "relational_1", c)) break;
    }
    return true;
  }

  // RELATIONAL_OPERATORS additive
  private static boolean relational_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RELATIONAL_OPERATORS(b, l + 1);
    r = r && additive(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_RETURN expression? PUNCTUATION_SEMICOLON
  static boolean returnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement")) return false;
    if (!nextTokenIs(b, KEYWORD_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_RETURN);
    r = r && returnStatement_1(b, l + 1);
    r = r && consumeToken(b, PUNCTUATION_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression?
  private static boolean returnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // variableDeclaration
  //                 | ifStatement
  //                 | functionDeclaration
  //                 | blockStatement
  //                 | importStatement
  //                 | returnStatement
  //                 | execStatement
  //                 | structDeclaration
  //                 | expressionStatement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = variableDeclaration(b, l + 1);
    if (!r) r = ifStatement(b, l + 1);
    if (!r) r = functionDeclaration(b, l + 1);
    if (!r) r = blockStatement(b, l + 1);
    if (!r) r = importStatement(b, l + 1);
    if (!r) r = returnStatement(b, l + 1);
    if (!r) r = execStatement(b, l + 1);
    if (!r) r = structDeclaration(b, l + 1);
    if (!r) r = expressionStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_STRUCT IDENTIFIER PUNCTUATION_LBRACE structField* PUNCTUATION_RBRACE
  public static boolean structDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration")) return false;
    if (!nextTokenIs(b, KEYWORD_STRUCT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_STRUCT, IDENTIFIER, PUNCTUATION_LBRACE);
    r = r && structDeclaration_3(b, l + 1);
    r = r && consumeToken(b, PUNCTUATION_RBRACE);
    exit_section_(b, m, STRUCT_DECLARATION, r);
    return r;
  }

  // structField*
  private static boolean structDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!structField(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "structDeclaration_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER type PUNCTUATION_SEMICOLON
  static boolean structField(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structField")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, PUNCTUATION_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // listType | baseType
  static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    r = listType(b, l + 1);
    if (!r) r = baseType(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (UNARY_OPERATORS unary) | value
  static boolean unary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unary_0(b, l + 1);
    if (!r) r = value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // UNARY_OPERATORS unary
  private static boolean unary_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UNARY_OPERATORS(b, l + 1);
    r = r && unary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // baseValue (postFix*)?
  static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = baseValue(b, l + 1);
    r = r && value_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (postFix*)?
  private static boolean value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_1")) return false;
    value_1_0(b, l + 1);
    return true;
  }

  // postFix*
  private static boolean value_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!postFix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "value_1_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_LET IDENTIFIER type OP_ASSIGN expression PUNCTUATION_SEMICOLON
  public static boolean variableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration")) return false;
    if (!nextTokenIs(b, KEYWORD_LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_LET, IDENTIFIER);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, OP_ASSIGN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, PUNCTUATION_SEMICOLON);
    exit_section_(b, m, VARIABLE_DECLARATION, r);
    return r;
  }

}
