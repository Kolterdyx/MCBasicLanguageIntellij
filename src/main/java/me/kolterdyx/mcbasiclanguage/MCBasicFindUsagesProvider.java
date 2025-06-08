package me.kolterdyx.mcbasiclanguage;

import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import me.kolterdyx.mcbasiclanguage.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class MCBasicFindUsagesProvider implements FindUsagesProvider {

    @Override
    public boolean canFindUsagesFor(@NotNull PsiElement element) {
        return element instanceof MCBasicNamedElement;
    }

    @Override
    public @Nullable WordsScanner getWordsScanner() {
        return new DefaultWordsScanner(new MCBasicLexerAdapter(),
                TokenSet.create(MCBasicTypes.IDENTIFIER),
                TokenSet.create(MCBasicTypes.COMMENT),
                TokenSet.create(MCBasicTypes.STRING_LITERAL));
    }

    @Override
    public @NotNull String getHelpId(@NotNull PsiElement element) {
        return "";
    }

    @Override
    public @NotNull String getType(@NotNull PsiElement element) {
        if (element instanceof MCBasicFunctionDeclaration) return "function";
        if (element instanceof MCBasicStructDeclaration) return "struct";
        if (element instanceof MCBasicVariableDeclaration) return "variable";
        return "identifier";
    }

    @Override
    public @NotNull String getDescriptiveName(@NotNull PsiElement element) {
        return Objects.requireNonNull(((MCBasicNamedElement) element).getName());
    }

    @Override
    public @NotNull String getNodeText(@NotNull PsiElement element, boolean useFullName) {
        return getDescriptiveName(element);
    }
}
