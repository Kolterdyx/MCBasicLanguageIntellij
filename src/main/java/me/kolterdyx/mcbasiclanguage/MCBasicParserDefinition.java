
package me.kolterdyx.mcbasiclanguage;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.IStubFileElementType;
import com.intellij.psi.tree.TokenSet;
import me.kolterdyx.mcbasiclanguage.parser.MCBasicParser;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicFile;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicTokenSets;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicTypes;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicStubFile;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicStubFileElementType;
import me.kolterdyx.mcbasiclanguage.stub.impl.MCBasicFunctionDeclarationStubElementType;
import org.jetbrains.annotations.NotNull;

final class MCBasicParserDefinition implements ParserDefinition {

  public static final IStubFileElementType<MCBasicStubFile> FILE = new MCBasicStubFileElementType();

  @NotNull
  @Override
  public Lexer createLexer(Project project) {
    return new MCBasicLexerAdapter();
  }

  @NotNull
  @Override
  public TokenSet getCommentTokens() {
    return MCBasicTokenSets.COMMENTS;
  }

  @NotNull
  @Override
  public TokenSet getStringLiteralElements() {
    return TokenSet.EMPTY;
  }

  @NotNull
  @Override
  public PsiParser createParser(final Project project) {
    return new MCBasicParser();
  }

  @NotNull
  @Override
  public IStubFileElementType<MCBasicStubFile> getFileNodeType() {
    return FILE;
  }

  @NotNull
  @Override
  public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
    return new MCBasicFile(viewProvider);
  }

  @NotNull
  @Override
  public PsiElement createElement(ASTNode node) {
    return MCBasicTypes.Factory.createElement(node);
  }

}
