
package me.kolterdyx.mcbasiclanguage.psi;

import com.intellij.psi.tree.IElementType;
import me.kolterdyx.mcbasiclanguage.MCBasicLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MCBasicElementType extends IElementType {

  public MCBasicElementType(@NotNull @NonNls String debugName) {
    super(debugName, MCBasicLanguage.INSTANCE);
  }

}
