// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package me.kolterdyx.mcbasiclanguage.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import me.kolterdyx.mcbasiclanguage.MCBasicFileType;
import me.kolterdyx.mcbasiclanguage.MCBasicLanguage;
import org.jetbrains.annotations.NotNull;

public class MCBasicFile extends PsiFileBase {

  public MCBasicFile(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, MCBasicLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public FileType getFileType() {
    return MCBasicFileType.INSTANCE;
  }

  @Override
  public String toString() {
    return "MCBasic File";
  }

}
