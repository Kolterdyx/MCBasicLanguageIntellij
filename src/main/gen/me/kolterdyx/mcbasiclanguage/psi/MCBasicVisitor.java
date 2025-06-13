// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class MCBasicVisitor extends PsiElementVisitor {

  public void visitBaseValue(@NotNull MCBasicBaseValue o) {
    visitNamedElement(o);
  }

  public void visitFunctionDeclaration(@NotNull MCBasicFunctionDeclaration o) {
    visitNamedElement(o);
  }

  public void visitStatement(@NotNull MCBasicStatement o) {
    visitPsiElement(o);
  }

  public void visitStructDeclaration(@NotNull MCBasicStructDeclaration o) {
    visitNamedElement(o);
  }

  public void visitVariableDeclaration(@NotNull MCBasicVariableDeclaration o) {
    visitNamedElement(o);
  }

  public void visitNamedElement(@NotNull MCBasicNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
