// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static me.kolterdyx.mcbasiclanguage.psi.MCBasicTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import me.kolterdyx.mcbasiclanguage.psi.*;

public class MCBasicFunctionCallImpl extends ASTWrapperPsiElement implements MCBasicFunctionCall {

  public MCBasicFunctionCallImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MCBasicVisitor visitor) {
    visitor.visitFunctionCall(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MCBasicVisitor) accept((MCBasicVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MCBasicOpDivide> getOpDivideList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicOpDivide.class);
  }

  @Override
  @NotNull
  public List<MCBasicOpEqual> getOpEqualList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicOpEqual.class);
  }

  @Override
  @NotNull
  public List<MCBasicOpGreater> getOpGreaterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicOpGreater.class);
  }

  @Override
  @NotNull
  public List<MCBasicOpGreaterEqual> getOpGreaterEqualList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicOpGreaterEqual.class);
  }

  @Override
  @NotNull
  public List<MCBasicOpLess> getOpLessList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicOpLess.class);
  }

  @Override
  @NotNull
  public List<MCBasicOpLessEqual> getOpLessEqualList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicOpLessEqual.class);
  }

  @Override
  @NotNull
  public List<MCBasicOpMinus> getOpMinusList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicOpMinus.class);
  }

  @Override
  @NotNull
  public List<MCBasicOpModulo> getOpModuloList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicOpModulo.class);
  }

  @Override
  @NotNull
  public List<MCBasicOpMultiply> getOpMultiplyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicOpMultiply.class);
  }

  @Override
  @NotNull
  public List<MCBasicOpNotEqual> getOpNotEqualList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicOpNotEqual.class);
  }

  @Override
  @NotNull
  public List<MCBasicOpPlus> getOpPlusList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicOpPlus.class);
  }

  @Override
  @NotNull
  public List<MCBasicPunctuationComma> getPunctuationCommaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicPunctuationComma.class);
  }

  @Override
  @NotNull
  public List<MCBasicPunctuationLbracket> getPunctuationLbracketList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicPunctuationLbracket.class);
  }

  @Override
  @NotNull
  public List<MCBasicPunctuationLparen> getPunctuationLparenList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicPunctuationLparen.class);
  }

  @Override
  @NotNull
  public List<MCBasicPunctuationRbracket> getPunctuationRbracketList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicPunctuationRbracket.class);
  }

  @Override
  @NotNull
  public List<MCBasicPunctuationRparen> getPunctuationRparenList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicPunctuationRparen.class);
  }

  @Override
  @NotNull
  public List<MCBasicFunctionCall> getFunctionCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicFunctionCall.class);
  }

  @Override
  @NotNull
  public List<MCBasicMemberAccess> getMemberAccessList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MCBasicMemberAccess.class);
  }

}
