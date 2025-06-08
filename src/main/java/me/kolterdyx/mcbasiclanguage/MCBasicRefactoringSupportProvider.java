package me.kolterdyx.mcbasiclanguage;

import com.intellij.lang.refactoring.RefactoringSupportProvider;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MCBasicRefactoringSupportProvider extends RefactoringSupportProvider {
    @Override
    public boolean isMemberInplaceRenameAvailable(@NotNull PsiElement elementToRename, @Nullable PsiElement context) {
        return elementToRename instanceof me.kolterdyx.mcbasiclanguage.psi.MCBasicFunctionDeclaration ||
               elementToRename instanceof me.kolterdyx.mcbasiclanguage.psi.MCBasicVariableDeclaration ||
               elementToRename instanceof me.kolterdyx.mcbasiclanguage.psi.MCBasicStructDeclaration;
    }
}
