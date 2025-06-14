package me.kolterdyx.mcbasiclanguage.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.*;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicPsiReference;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicElement;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public abstract class MCBasicElementImpl extends ASTWrapperPsiElement implements MCBasicElement {
    public MCBasicElementImpl(@NotNull ASTNode node) {super(node);}

    @Override
    public PsiReference getReference() {
        return new MCBasicPsiReference(this);
    }

}
