
package me.kolterdyx.mcbasiclanguage.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiNameIdentifierOwner;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class MCBasicNamedElementImpl extends ASTWrapperPsiElement implements MCBasicNamedElement {

  public MCBasicNamedElementImpl(@NotNull ASTNode node) {
    super(node);
  }

}
