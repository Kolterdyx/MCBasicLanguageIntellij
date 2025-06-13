package me.kolterdyx.mcbasiclanguage.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;
import org.jetbrains.annotations.NotNull;

public interface MCBasicNamedElement extends PsiNameIdentifierOwner {
    String getName();
    PsiElement setName(@NotNull String name);
    PsiElement getNameIdentifier();
}
