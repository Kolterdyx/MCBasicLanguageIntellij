// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MCBasicParameter extends MCBasicNamedElement {

  @Nullable
  MCBasicIdentifierType getIdentifierType();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

}
