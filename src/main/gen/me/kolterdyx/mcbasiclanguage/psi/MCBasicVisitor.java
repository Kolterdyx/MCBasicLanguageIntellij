// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class MCBasicVisitor extends PsiElementVisitor {

  public void visitProperty(@NotNull MCBasicProperty o) {
    visitNamedElement(o);
  }

  public void visitNamedElement(@NotNull MCBasicNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
