// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicNamedStubElement;

public interface MCBasicFunctionDeclaration extends MCBasicNamedElement, StubBasedPsiElement<MCBasicNamedStubElement> {

  @Nullable
  MCBasicIdentifierType getIdentifierType();

  @NotNull
  List<MCBasicParameter> getParameterList();

  @NotNull
  List<MCBasicStatement> getStatementList();

}
