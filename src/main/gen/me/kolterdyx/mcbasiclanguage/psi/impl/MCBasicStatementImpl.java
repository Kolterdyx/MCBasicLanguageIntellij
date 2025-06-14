// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static me.kolterdyx.mcbasiclanguage.psi.MCBasicTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import me.kolterdyx.mcbasiclanguage.psi.*;

public class MCBasicStatementImpl extends ASTWrapperPsiElement implements MCBasicStatement {

  public MCBasicStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MCBasicVisitor visitor) {
    visitor.visitStatement(this);
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

  @Override
  @Nullable
  public MCBasicFunctionDeclaration getFunctionDeclaration() {
    return PsiTreeUtil.getChildOfType(this, MCBasicFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public MCBasicImportStatement getImportStatement() {
    return PsiTreeUtil.getChildOfType(this, MCBasicImportStatement.class);
  }

  @Override
  @NotNull
  public List<MCBasicStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicStatement.class);
  }

  @Override
  @Nullable
  public MCBasicStructDeclaration getStructDeclaration() {
    return PsiTreeUtil.getChildOfType(this, MCBasicStructDeclaration.class);
  }

  @Override
  @Nullable
  public MCBasicVariableDeclaration getVariableDeclaration() {
    return PsiTreeUtil.getChildOfType(this, MCBasicVariableDeclaration.class);
  }

}
