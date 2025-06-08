// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package me.kolterdyx.mcbasiclanguage;

import com.intellij.icons.AllIcons;
import com.intellij.ide.navigationToolbar.StructureAwareNavBarModelExtension;
import com.intellij.lang.Language;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicFile;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

final class MCBasicStructureAwareNavbar extends StructureAwareNavBarModelExtension {

  @NotNull
  @Override
  protected Language getLanguage() {
    return MCBasicLanguage.INSTANCE;
  }

  @Override
  public @Nullable String getPresentableText(Object object) {
    if (object instanceof MCBasicFile) {
      return ((MCBasicFile) object).getName();
    }
    if (object instanceof MCBasicProperty) {
      return ((MCBasicProperty) object).getName();
    }

    return null;
  }

  @Override
  @Nullable
  public Icon getIcon(Object object) {
    if (object instanceof MCBasicProperty) {
      return AllIcons.Nodes.Property;
    }

    return null;
  }

}
