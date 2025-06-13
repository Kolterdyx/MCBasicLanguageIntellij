package me.kolterdyx.mcbasiclanguage;


import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.tree.TokenSet;
import me.kolterdyx.mcbasiclanguage.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class MCBasicFindUsagesProvider implements FindUsagesProvider {

    @Override
    public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
        return psiElement instanceof MCBasicNamedElement;
    }

    @Override
    public @Nullable WordsScanner getWordsScanner() {
        return new DefaultWordsScanner(
                new MCBasicLexerAdapter(),  // your lexer
                TokenSet.create(MCBasicTypes.IDENTIFIER), // what counts as identifiers
                TokenSet.create(MCBasicTypes.COMMENT),    // comments
                TokenSet.create(MCBasicTypes.STRING_LITERAL) // literals
        );
    }

    @Override
    public @Nullable String getHelpId(@NotNull PsiElement element) {
        return null;
    }

    @Override
    public @NotNull String getType(@NotNull PsiElement element) {
        return switch (element) {
            case MCBasicFunctionDeclaration mcBasicFunctionDeclaration -> "function";
            case MCBasicVariableDeclaration mcBasicVariableDeclaration -> "variable";
            case MCBasicStructDeclaration mcBasicStructDeclaration -> "struct";
            default -> "element";
        };
    }

    @Override
    public @NotNull String getDescriptiveName(@NotNull PsiElement element) {
        return Objects.requireNonNull(((PsiNamedElement) element).getName());
    }

    @Override
    public @NotNull String getNodeText(@NotNull PsiElement element, boolean useFullName) {
        return getDescriptiveName(element);
    }
}
