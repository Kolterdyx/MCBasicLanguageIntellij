// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package me.kolterdyx.mcbasiclanguage;

import com.intellij.ide.IconProvider;
import com.intellij.psi.PsiElement;
import me.kolterdyx.mcbasiclanguage.MCBasicIcons;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

final class MCBasicPropertyIconProvider extends IconProvider {

  @Override
  public @Nullable Icon getIcon(@NotNull PsiElement element, int flags) {
    return element instanceof MCBasicProperty ? MCBasicIcons.FILE : null;
  }

}
