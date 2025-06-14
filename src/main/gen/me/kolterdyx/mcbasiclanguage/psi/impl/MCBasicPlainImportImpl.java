// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi.impl;

import java.util.List;

import me.kolterdyx.mcbasiclanguage.stub.MCBasicImportStubElement;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static me.kolterdyx.mcbasiclanguage.psi.MCBasicTypes.*;
import me.kolterdyx.mcbasiclanguage.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicNamedStubElement;

public class MCBasicPlainImportImpl extends MCBasicImportElementImpl implements MCBasicPlainImport {

  public MCBasicPlainImportImpl(ASTNode node) {
    super(node);
  }

  public MCBasicPlainImportImpl(MCBasicImportStubElement stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull MCBasicVisitor visitor) {
    visitor.visitPlainImport(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MCBasicVisitor) accept((MCBasicVisitor)visitor);
    else super.accept(visitor);
  }

}
