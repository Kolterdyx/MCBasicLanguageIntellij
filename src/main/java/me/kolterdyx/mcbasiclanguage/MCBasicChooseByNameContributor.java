// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package me.kolterdyx.mcbasiclanguage;

import com.intellij.navigation.ChooseByNameContributorEx;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.project.Project;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.util.Processor;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.util.indexing.FindSymbolParameters;
import com.intellij.util.indexing.IdFilter;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

final class MCBasicChooseByNameContributor implements ChooseByNameContributorEx {

  @Override
  public void processNames(@NotNull Processor<? super String> processor,
                           @NotNull GlobalSearchScope scope,
                           @Nullable IdFilter filter) {
    Project project = Objects.requireNonNull(scope.getProject());
    List<String> propertyKeys = ContainerUtil.map(
        MCBasicUtil.findProperties(project), MCBasicProperty::getKey);
    ContainerUtil.process(propertyKeys, processor);
  }

  @Override
  public void processElementsWithName(@NotNull String name,
                                      @NotNull Processor<? super NavigationItem> processor,
                                      @NotNull FindSymbolParameters parameters) {
    List<NavigationItem> properties = ContainerUtil.map(
        MCBasicUtil.findProperties(parameters.getProject(), name),
        property -> (NavigationItem) property);
    ContainerUtil.process(properties, processor);
  }

}
