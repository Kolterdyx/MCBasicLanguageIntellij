// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package me.kolterdyx.mcbasiclanguage.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicElementFactory;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicProperty;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicTypes;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MCBasicPsiImplUtil {

  public static String getKey(MCBasicProperty element) {
    ASTNode keyNode = element.getNode().findChildByType(MCBasicTypes.KEY);
    if (keyNode != null) {
      // IMPORTANT: Convert embedded escaped spaces to simple spaces
      return keyNode.getText().replaceAll("\\\\ ", " ");
    } else {
      return null;
    }
  }

  public static String getValue(MCBasicProperty element) {
    ASTNode valueNode = element.getNode().findChildByType(MCBasicTypes.VALUE);
    if (valueNode != null) {
      return valueNode.getText();
    } else {
      return null;
    }
  }

  public static String getName(MCBasicProperty element) {
    return getKey(element);
  }

  public static PsiElement setName(MCBasicProperty element, String newName) {
    ASTNode keyNode = element.getNode().findChildByType(MCBasicTypes.KEY);
    if (keyNode != null) {
      MCBasicProperty property = MCBasicElementFactory.createProperty(element.getProject(), newName);
      ASTNode newKeyNode = property.getFirstChild().getNode();
      element.getNode().replaceChild(keyNode, newKeyNode);
    }
    return element;
  }

  public static PsiElement getNameIdentifier(MCBasicProperty element) {
    ASTNode keyNode = element.getNode().findChildByType(MCBasicTypes.KEY);
    if (keyNode != null) {
      return keyNode.getPsi();
    } else {
      return null;
    }
  }

  public static ItemPresentation getPresentation(final MCBasicProperty element) {
    return new ItemPresentation() {
      @Nullable
      @Override
      public String getPresentableText() {
        return element.getKey();
      }

      @Nullable
      @Override
      public String getLocationString() {
        PsiFile containingFile = element.getContainingFile();
        return containingFile == null ? null : containingFile.getName();
      }

      @Override
      public Icon getIcon(boolean unused) {
        return element.getIcon(0);
      }
    };
  }

}
