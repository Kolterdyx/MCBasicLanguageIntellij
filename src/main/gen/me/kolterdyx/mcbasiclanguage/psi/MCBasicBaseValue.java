// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MCBasicBaseValue extends MCBasicNamedElement {

  @NotNull
  List<MCBasicBaseValue> getBaseValueList();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

}
