// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MCBasicFunctionCall extends PsiElement {

  @NotNull
  List<MCBasicOpDivide> getOpDivideList();

  @NotNull
  List<MCBasicOpEqual> getOpEqualList();

  @NotNull
  List<MCBasicOpGreater> getOpGreaterList();

  @NotNull
  List<MCBasicOpGreaterEqual> getOpGreaterEqualList();

  @NotNull
  List<MCBasicOpLess> getOpLessList();

  @NotNull
  List<MCBasicOpLessEqual> getOpLessEqualList();

  @NotNull
  List<MCBasicOpMinus> getOpMinusList();

  @NotNull
  List<MCBasicOpModulo> getOpModuloList();

  @NotNull
  List<MCBasicOpMultiply> getOpMultiplyList();

  @NotNull
  List<MCBasicOpNotEqual> getOpNotEqualList();

  @NotNull
  List<MCBasicOpPlus> getOpPlusList();

  @NotNull
  List<MCBasicPunctuationComma> getPunctuationCommaList();

  @NotNull
  List<MCBasicPunctuationLbracket> getPunctuationLbracketList();

  @NotNull
  List<MCBasicPunctuationLparen> getPunctuationLparenList();

  @NotNull
  List<MCBasicPunctuationRbracket> getPunctuationRbracketList();

  @NotNull
  List<MCBasicPunctuationRparen> getPunctuationRparenList();

  @NotNull
  List<MCBasicFunctionCall> getFunctionCallList();

  @NotNull
  List<MCBasicMemberAccess> getMemberAccessList();

}
