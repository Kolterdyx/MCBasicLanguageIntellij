// Copyright 2000-2022 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package me.kolterdyx.mcbasiclanguage.psi;

import com.intellij.psi.tree.TokenSet;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicTypes;

public interface MCBasicTokenSets {

  TokenSet IDENTIFIERS = TokenSet.create(MCBasicTypes.KEY);

  TokenSet COMMENTS = TokenSet.create(MCBasicTypes.COMMENT);

}
