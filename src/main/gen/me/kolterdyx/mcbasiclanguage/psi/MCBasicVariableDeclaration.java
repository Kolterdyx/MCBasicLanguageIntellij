// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicNamedStubElement;

public interface MCBasicVariableDeclaration extends MCBasicNamedElement, StubBasedPsiElement<MCBasicNamedStubElement> {

  @NotNull
  List<MCBasicBaseValue> getBaseValueList();

  @Nullable
  MCBasicIdentifierType getIdentifierType();

}
