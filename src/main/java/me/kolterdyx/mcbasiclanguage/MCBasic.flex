// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package me.kolterdyx.mcbasiclanguage;

import com.intellij.psi.tree.IElementType;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicTypes;
import com.intellij.psi.TokenType;
import com.intellij.lexer.FlexLexer;

%%

%class MCBasicLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

NewLine=\R
Whitespace=[\ \n\t\f]
Comment=("#")[^\r\n]*
Identifier = [:jletter:] [:jletterdigit:]*

DecInteger = [0-9]+
DecDouble = [0-9]*\.[0-9]+([eE][+-]?[0-9]+)?

%state STRING

%%


<YYINITIAL> {

    /* Keywords */
    "exec"                          { yybegin(YYINITIAL); return MCBasicTypes.KEYWORD_EXEC; }
    "if"                            { yybegin(YYINITIAL); return MCBasicTypes.KEYWORD_IF; }
    "else"                          { yybegin(YYINITIAL); return MCBasicTypes.KEYWORD_ELSE; }
    "func"                          { yybegin(YYINITIAL); return MCBasicTypes.KEYWORD_FUNC; }
    "return"                        { yybegin(YYINITIAL); return MCBasicTypes.KEYWORD_RETURN; }
    "let"                           { yybegin(YYINITIAL); return MCBasicTypes.KEYWORD_LET; }
    "import"                        { yybegin(YYINITIAL); return MCBasicTypes.KEYWORD_IMPORT; }
    "as"                            { yybegin(YYINITIAL); return MCBasicTypes.KEYWORD_AS; }
    "from"                          { yybegin(YYINITIAL); return MCBasicTypes.KEYWORD_FROM; }
    "struct"                        { yybegin(YYINITIAL); return MCBasicTypes.KEYWORD_STRUCT; }
    "int"                           { yybegin(YYINITIAL); return MCBasicTypes.KEYWORD_INT; }
    "str"                           { yybegin(YYINITIAL); return MCBasicTypes.KEYWORD_STR; }
    "double"                        { yybegin(YYINITIAL); return MCBasicTypes.KEYWORD_DOUBLE; }

    /* Operators */
    "="                             { yybegin(YYINITIAL); return MCBasicTypes.OP_ASSIGN; }
    "=="                            { yybegin(YYINITIAL); return MCBasicTypes.OP_EQUAL; }
    "!="                            { yybegin(YYINITIAL); return MCBasicTypes.OP_NOT_EQUAL; }
    "<"                             { yybegin(YYINITIAL); return MCBasicTypes.OP_LESS; }
    "<="                            { yybegin(YYINITIAL); return MCBasicTypes.OP_LESS_EQUAL; }
    ">"                             { yybegin(YYINITIAL); return MCBasicTypes.OP_GREATER; }
    ">="                            { yybegin(YYINITIAL); return MCBasicTypes.OP_GREATER_EQUAL; }
    "+"                             { yybegin(YYINITIAL); return MCBasicTypes.OP_PLUS; }
    "-"                             { yybegin(YYINITIAL); return MCBasicTypes.OP_MINUS; }
    "*"                             { yybegin(YYINITIAL); return MCBasicTypes.OP_MULTIPLY; }
    "/"                             { yybegin(YYINITIAL); return MCBasicTypes.OP_DIVIDE; }
    "%"                             { yybegin(YYINITIAL); return MCBasicTypes.OP_MODULO; }
    "and"                           { yybegin(YYINITIAL); return MCBasicTypes.OP_AND; }
    "or"                            { yybegin(YYINITIAL); return MCBasicTypes.OP_OR; }
    "!"                             { yybegin(YYINITIAL); return MCBasicTypes.OP_NOT; }


     /* Identifier */
    {Identifier}                    { yybegin(YYINITIAL); return MCBasicTypes.IDENTIFIER; }

    /* comments */
    {Comment}                       { yybegin(YYINITIAL); return MCBasicTypes.COMMENT; }

    /* whitespace */
    ({NewLine}|{Whitespace})+       { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

    /* numbers */
    {DecInteger}                    { yybegin(YYINITIAL); return MCBasicTypes.INTEGER_LITERAL; }
    {DecDouble}                     { yybegin(YYINITIAL); return MCBasicTypes.DOUBLE_LITERAL; }

    /* string */
    \"                              { yybegin(STRING); }

    /* punctuation */
    ","                             { yybegin(YYINITIAL); return MCBasicTypes.PUNCTUATION_COMMA; }
    ";"                             { yybegin(YYINITIAL); return MCBasicTypes.PUNCTUATION_SEMICOLON; }
    "("                             { yybegin(YYINITIAL); return MCBasicTypes.PUNCTUATION_LPAREN; }
    ")"                             { yybegin(YYINITIAL); return MCBasicTypes.PUNCTUATION_RPAREN; }
    "{"                             { yybegin(YYINITIAL); return MCBasicTypes.PUNCTUATION_LBRACE; }
    "}"                             { yybegin(YYINITIAL); return MCBasicTypes.PUNCTUATION_RBRACE; }
    "["                             { yybegin(YYINITIAL); return MCBasicTypes.PUNCTUATION_LBRACKET; }
    "]"                             { yybegin(YYINITIAL); return MCBasicTypes.PUNCTUATION_RBRACKET; }
    "."                             { yybegin(YYINITIAL); return MCBasicTypes.PUNCTUATION_DOT; }
}

<STRING> {
    \"                              { yybegin(YYINITIAL); return MCBasicTypes.STRING_LITERAL; }
    [^\n\r\"\\]+                    {  }
    \\n                             {  }
}


[^]                                 { return TokenType.BAD_CHARACTER; }
