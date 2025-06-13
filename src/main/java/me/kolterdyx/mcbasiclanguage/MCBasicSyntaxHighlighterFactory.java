
package me.kolterdyx.mcbasiclanguage;

import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import me.kolterdyx.mcbasiclanguage.MCBasicSyntaxHighlighter;
import org.jetbrains.annotations.NotNull;

final class MCBasicSyntaxHighlighterFactory extends SyntaxHighlighterFactory {

  @NotNull
  @Override
  public SyntaxHighlighter getSyntaxHighlighter(Project project, VirtualFile virtualFile) {
    return new MCBasicSyntaxHighlighter();
  }

}
