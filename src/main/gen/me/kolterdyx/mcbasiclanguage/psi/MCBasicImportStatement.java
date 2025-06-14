// This is a generated file. Not intended for manual editing.
package me.kolterdyx.mcbasiclanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MCBasicImportStatement extends PsiElement {

  @NotNull
  List<MCBasicAliasedImport> getAliasedImportList();

  @NotNull
  MCBasicImportPath getImportPath();

  @NotNull
  List<MCBasicPlainImport> getPlainImportList();

}
