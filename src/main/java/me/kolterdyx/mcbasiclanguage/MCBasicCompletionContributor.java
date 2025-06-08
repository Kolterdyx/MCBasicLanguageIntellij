// Copyright 2000-2023 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package me.kolterdyx.mcbasiclanguage;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicTypes;
import org.jetbrains.annotations.NotNull;

final class MCBasicCompletionContributor extends CompletionContributor {

  MCBasicCompletionContributor() {
    extend(CompletionType.BASIC, PlatformPatterns.psiElement(MCBasicTypes.VALUE),
        new CompletionProvider<>() {
          public void addCompletions(@NotNull CompletionParameters parameters,
                                     @NotNull ProcessingContext context,
                                     @NotNull CompletionResultSet resultSet) {
            resultSet.addElement(LookupElementBuilder.create("Hello"));
          }
        }
    );
  }

}
