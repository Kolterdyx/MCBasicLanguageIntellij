// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import me.kolterdyx.mcbasiclanguage.psi.stubs.FunctionStub;

public class MCBasicVisitor extends PsiElementVisitor {

  public void visitBaseValue(@NotNull MCBasicBaseValue o) {
    visitPsiElement(o);
  }

  public void visitFunctionDeclaration(@NotNull MCBasicFunctionDeclaration o) {
    visitNamedElement(o);
    // visitStubBasedPsiElement(o);
  }

  public void visitStatement(@NotNull MCBasicStatement o) {
    visitPsiElement(o);
  }

  public void visitStructDeclaration(@NotNull MCBasicStructDeclaration o) {
    visitPsiElement(o);
  }

  public void visitVariableDeclaration(@NotNull MCBasicVariableDeclaration o) {
    visitPsiElement(o);
  }

  public void visitNamedElement(@NotNull MCBasicNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
