// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static me.kolterdyx.mcbasiclanguage.psi.MCBasicTypes.*;
import me.kolterdyx.mcbasiclanguage.psi.*;

public class MCBasicStructDeclarationImpl extends MCBasicNamedElementImpl implements MCBasicStructDeclaration {

  public MCBasicStructDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MCBasicVisitor visitor) {
    visitor.visitStructDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MCBasicVisitor) accept((MCBasicVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MCBasicIdentifierType> getIdentifierTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicIdentifierType.class);
  }

  @Override
  public String getName() {
    return MCBasicPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return MCBasicPsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return MCBasicPsiImplUtil.getNameIdentifier(this);
  }

}
