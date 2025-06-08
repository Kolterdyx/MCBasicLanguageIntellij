// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import me.kolterdyx.mcbasiclanguage.psi.stubs.FunctionStub;

public interface MCBasicFunctionDeclaration extends MCBasicNamedElement, StubBasedPsiElement<FunctionStub> {

  @NotNull
  List<MCBasicStatement> getStatementList();

}
