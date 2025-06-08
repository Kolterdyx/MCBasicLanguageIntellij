// Copyright 2000-2022 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package me.kolterdyx.mcbasiclanguage;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import me.kolterdyx.mcbasiclanguage.MCBasicStructureViewElement;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MCBasicStructureViewModel extends StructureViewModelBase implements
    StructureViewModel.ElementInfoProvider {

  public MCBasicStructureViewModel(@Nullable Editor editor, PsiFile psiFile) {
    super(psiFile, editor, new MCBasicStructureViewElement(psiFile));
  }

  @NotNull
  public Sorter @NotNull [] getSorters() {
    return new Sorter[]{Sorter.ALPHA_SORTER};
  }


  @Override
  public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
    return false;
  }

  @Override
  public boolean isAlwaysLeaf(StructureViewTreeElement element) {
    return element.getValue() instanceof MCBasicProperty;
  }

  @Override
  protected Class<?> @NotNull [] getSuitableClasses() {
    return new Class[]{MCBasicProperty.class};
  }

}
