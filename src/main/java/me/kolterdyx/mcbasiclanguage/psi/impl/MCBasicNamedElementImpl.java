
package me.kolterdyx.mcbasiclanguage.psi.impl;

import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.IStubElementType;
import me.kolterdyx.mcbasiclanguage.psi.*;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicNamedStub;
import org.jetbrains.annotations.NotNull;

public abstract class MCBasicNamedElementImpl extends StubBasedPsiElementBase<MCBasicNamedStub> implements MCBasicNamedElement {

  public MCBasicNamedElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public MCBasicNamedElementImpl(@NotNull MCBasicNamedStub stub, IStubElementType<?, ?> nodeType) {
    super(stub, nodeType);
  }

  @Override
  public String getName() {
    MCBasicNamedStub stub = getStub();
    if (stub != null) return stub.getName();
    PsiElement id = getNameIdentifier();
    return id != null ? id.getText() : null;
  }

  @Override
  public PsiElement setName(@NotNull String newName) {
    PsiElement identifier = getNameIdentifier();
    if (identifier != null) {
      PsiElement newId = MCBasicElementFactory.createIdentifier(getProject(), newName);
      if (newId != null) {
        identifier.replace(newId);
      }
    }
    return this;
  }

  @Override
  public PsiElement getNameIdentifier() {
    return findChildByType(MCBasicTypes.IDENTIFIER);
  }

}
