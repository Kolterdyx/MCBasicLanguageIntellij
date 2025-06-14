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

public class MCBasicImportStatementImpl extends ASTWrapperPsiElement implements MCBasicImportStatement {

  public MCBasicImportStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MCBasicVisitor visitor) {
    visitor.visitImportStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MCBasicVisitor) accept((MCBasicVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MCBasicAliasedImport> getAliasedImportList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicAliasedImport.class);
  }

  @Override
  @NotNull
  public MCBasicImportPath getImportPath() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, MCBasicImportPath.class));
  }

  @Override
  @NotNull
  public List<MCBasicPlainImport> getPlainImportList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicPlainImport.class);
  }

}
