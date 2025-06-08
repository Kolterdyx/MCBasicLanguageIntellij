// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package me.kolterdyx.mcbasiclanguage;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicTypes;
import org.jetbrains.annotations.NotNull;


import java.util.List;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class MCBasicSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey FUNCTION_DECLARATION = createTextAttributesKey("MCB_FUNCTION_DECLARATION", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
    public static final TextAttributesKey VARIABLE_DECLARATION = createTextAttributesKey("MCB_VARIABLE_DECLARATION", DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
    public static final TextAttributesKey STRUCT_DECLARATION = createTextAttributesKey("MCB_STRUCT_DECLARATION", DefaultLanguageHighlighterColors.CLASS_NAME);

    private static final List<IElementType> KEYWORDS = List.of(
            MCBasicTypes.KEYWORD_IF,
            MCBasicTypes.KEYWORD_ELSE,
            MCBasicTypes.KEYWORD_RETURN,
            MCBasicTypes.KEYWORD_FUNC,
            MCBasicTypes.KEYWORD_LET,
            MCBasicTypes.KEYWORD_FROM,
            MCBasicTypes.KEYWORD_IMPORT,
            MCBasicTypes.KEYWORD_INT,
            MCBasicTypes.KEYWORD_DOUBLE,
            MCBasicTypes.KEYWORD_STR,
            MCBasicTypes.KEYWORD_STRUCT,
            MCBasicTypes.KEYWORD_EXEC,
            MCBasicTypes.KEYWORD_AS
    );

    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{
            createTextAttributesKey("MCB_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD),
    };

    private static final TextAttributesKey[] BRACE_KEYS = new TextAttributesKey[]{
            createTextAttributesKey("MCB_BRACES", DefaultLanguageHighlighterColors.BRACES)
    };

    private static final TextAttributesKey[] BRACKET_KEYS = new TextAttributesKey[]{
            createTextAttributesKey("MCB_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS)
    };

    private static final TextAttributesKey[] PAREN_KEYS = new TextAttributesKey[]{
            createTextAttributesKey("MCB_PARENS", DefaultLanguageHighlighterColors.PARENTHESES)
    };

    private static final TextAttributesKey[] SEMICOLON_KEYS = new TextAttributesKey[]{
            createTextAttributesKey("MCB_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON)
    };

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{
            createTextAttributesKey("MCB_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)
    };

    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{
            createTextAttributesKey("MCB_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
    };

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new MCBasicLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(MCBasicTypes.STRING_LITERAL)) {
            return new TextAttributesKey[]{DefaultLanguageHighlighterColors.STRING};
        }
        if (tokenType.equals(MCBasicTypes.INTEGER_LITERAL)) {
            return new TextAttributesKey[]{DefaultLanguageHighlighterColors.NUMBER};
        }
        if (tokenType.equals(MCBasicTypes.DOUBLE_LITERAL)) {
            return new TextAttributesKey[]{DefaultLanguageHighlighterColors.NUMBER};
        }
        if (tokenType.equals(MCBasicTypes.PUNCTUATION_RBRACE) || tokenType.equals(MCBasicTypes.PUNCTUATION_LBRACE)) {
            return BRACE_KEYS;
        }
        if (tokenType.equals(MCBasicTypes.PUNCTUATION_RBRACKET) || tokenType.equals(MCBasicTypes.PUNCTUATION_LBRACKET)) {
            return BRACKET_KEYS;
        }
        if (tokenType.equals(MCBasicTypes.PUNCTUATION_RPAREN) || tokenType.equals(MCBasicTypes.PUNCTUATION_LPAREN)) {
            return PAREN_KEYS;
        }
        if (KEYWORDS.contains(tokenType)) {
            return KEYWORD_KEYS;
        }
        if (tokenType.equals(MCBasicTypes.PUNCTUATION_SEMICOLON)) {
            return SEMICOLON_KEYS;
        }
        if (tokenType.equals(MCBasicTypes.PUNCTUATION_COMMA)) {
            return new TextAttributesKey[]{DefaultLanguageHighlighterColors.COMMA};
        }
        if (tokenType.equals(MCBasicTypes.PUNCTUATION_DOT)) {
            return new TextAttributesKey[]{DefaultLanguageHighlighterColors.DOT};
        }
        if (tokenType.equals(MCBasicTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        return EMPTY_KEYS;
    }

}
