// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MCBasicStatement extends PsiElement {

  @NotNull
  List<MCBasicBaseValue> getBaseValueList();

  @Nullable
  MCBasicFunctionDeclaration getFunctionDeclaration();

  @Nullable
  MCBasicImportStatement getImportStatement();

  @NotNull
  List<MCBasicStatement> getStatementList();

  @Nullable
  MCBasicStructDeclaration getStructDeclaration();

  @Nullable
  MCBasicVariableDeclaration getVariableDeclaration();

}
