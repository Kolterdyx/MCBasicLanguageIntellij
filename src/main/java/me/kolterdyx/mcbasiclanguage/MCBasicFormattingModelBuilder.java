// Copyright 2000-2023 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package me.kolterdyx.mcbasiclanguage;

import com.intellij.formatting.*;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicTypes;
import org.jetbrains.annotations.NotNull;

final class MCBasicFormattingModelBuilder implements FormattingModelBuilder {

  private static SpacingBuilder createSpaceBuilder(CodeStyleSettings settings) {
    return new SpacingBuilder(settings, MCBasicLanguage.INSTANCE)
        .around(MCBasicTypes.SEPARATOR)
        .spaceIf(settings.getCommonSettings(MCBasicLanguage.INSTANCE.getID()).SPACE_AROUND_ASSIGNMENT_OPERATORS)
        .before(MCBasicTypes.PROPERTY)
        .none();
  }

  @Override
  public @NotNull FormattingModel createModel(@NotNull FormattingContext formattingContext) {
    final CodeStyleSettings codeStyleSettings = formattingContext.getCodeStyleSettings();
    return FormattingModelProvider
        .createFormattingModelForPsiFile(formattingContext.getContainingFile(),
            new MCBasicBlock(formattingContext.getNode(),
                Wrap.createWrap(WrapType.NONE, false),
                Alignment.createAlignment(),
                createSpaceBuilder(codeStyleSettings)),
            codeStyleSettings);
  }

}
