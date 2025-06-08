// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package me.kolterdyx.mcbasiclanguage;

import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo;
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider;
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLiteralExpression;
import com.intellij.psi.impl.source.tree.java.PsiJavaTokenImpl;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicProperty;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

final class MCBasicLineMarkerProvider extends RelatedItemLineMarkerProvider {

  @Override
  protected void collectNavigationMarkers(@NotNull PsiElement element,
                                          @NotNull Collection<? super RelatedItemLineMarkerInfo<?>> result) {
    // This must be an element with a literal expression as a parent
    if (!(element instanceof PsiJavaTokenImpl) || !(element.getParent() instanceof PsiLiteralExpression literalExpression)) {
      return;
    }

    // The literal expression must start with the MCBasic language literal expression
    String value = literalExpression.getValue() instanceof String ? (String) literalExpression.getValue() : null;
    if ((value == null) ||
        !value.startsWith(MCBasicAnnotator.SIMPLE_PREFIX_STR + MCBasicAnnotator.SIMPLE_SEPARATOR_STR)) {
      return;
    }

    // Get the MCBasic language property usage
    Project project = element.getProject();
    String possibleProperties = value.substring(
        MCBasicAnnotator.SIMPLE_PREFIX_STR.length() + MCBasicAnnotator.SIMPLE_SEPARATOR_STR.length()
    );
    final List<MCBasicProperty> properties = MCBasicUtil.findProperties(project, possibleProperties);
    if (!properties.isEmpty()) {
      // Add the property to a collection of line marker info
      NavigationGutterIconBuilder<PsiElement> builder =
          NavigationGutterIconBuilder.create(MCBasicIcons.FILE)
              .setTargets(properties)
              .setTooltipText("Navigate to MCBasic language property");
      result.add(builder.createLineMarkerInfo(element));
    }
  }

}
