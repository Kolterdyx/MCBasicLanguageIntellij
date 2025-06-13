// Copyright 2000-2022 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package me.kolterdyx.mcbasiclanguage.psi;

import com.intellij.psi.tree.TokenSet;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicTypes;

public interface MCBasicTokenSets {

    TokenSet KEYWORDS = TokenSet.create(
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

    TokenSet LITERALS = TokenSet.create(
            MCBasicTypes.STRING_LITERAL,
            MCBasicTypes.INTEGER_LITERAL,
            MCBasicTypes.DOUBLE_LITERAL
    );
    TokenSet COMMENTS = TokenSet.create(MCBasicTypes.COMMENT);

}
