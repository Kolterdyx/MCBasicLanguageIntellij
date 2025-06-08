// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static me.kolterdyx.mcbasiclanguage.psi.MCBasicTypes.*;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicNamedElement;
import me.kolterdyx.mcbasiclanguage.psi.stubs.FunctionStub;
import me.kolterdyx.mcbasiclanguage.psi.*;

public class MCBasicFunctionDeclarationImpl extends MCBasicNamedElement<FunctionStub> implements MCBasicFunctionDeclaration {

  public MCBasicFunctionDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MCBasicVisitor visitor) {
    visitor.visitFunctionDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MCBasicVisitor) accept((MCBasicVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MCBasicStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicStatement.class);
  }

}
