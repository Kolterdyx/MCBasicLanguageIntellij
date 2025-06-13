// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MCBasicFunctionDeclaration extends MCBasicNamedElement {

  @NotNull
  List<MCBasicStatement> getStatementList();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

}
