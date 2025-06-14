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
import me.kolterdyx.mcbasiclanguage.stub.MCBasicNamedStubElement;
import com.intellij.psi.stubs.IStubElementType;

public class MCBasicStructDeclarationImpl extends MCBasicNamedElementImpl implements MCBasicStructDeclaration {

  public MCBasicStructDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public MCBasicStructDeclarationImpl(@NotNull MCBasicNamedStubElement stub, IStubElementType<?, ?> type) {
    super(stub, type);
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

}
