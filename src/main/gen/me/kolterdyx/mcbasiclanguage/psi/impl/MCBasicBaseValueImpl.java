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

public class MCBasicBaseValueImpl extends MCBasicElementImpl implements MCBasicBaseValue {

  public MCBasicBaseValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MCBasicVisitor visitor) {
    visitor.visitBaseValue(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MCBasicVisitor) accept((MCBasicVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MCBasicBaseValue> getBaseValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicBaseValue.class);
  }

}
