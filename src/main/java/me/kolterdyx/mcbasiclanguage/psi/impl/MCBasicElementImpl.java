package me.kolterdyx.mcbasiclanguage.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.*;
import com.intellij.psi.util.PsiTreeUtil;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicNamedElement;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicPsiReference;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public abstract class MCBasicElementImpl extends ASTWrapperPsiElement implements MCBasicElement {
    public MCBasicElementImpl(@NotNull ASTNode node) {super(node);}

    @Override
    public PsiReference getReference() {
        return new MCBasicPsiReference(this);
//        PsiElement identifier = this.getFirstChild(); // assuming baseValue starts with IDENTIFIER
//        if (identifier == null) return null;
//        return new PsiReferenceBase<PsiElement>(this, identifier.getTextRangeInParent()) {
//            @Override
//            public @Nullable PsiElement resolve() {
//                // Walk up the tree, find a function declaration matching the name
//                String name = identifier.getText();
//                PsiFile file = getElement().getContainingFile();
//                return PsiTreeUtil.findChildrenOfType(file, MCBasicNamedElement.class)
//                        .stream()
//                        .filter(e -> name.equals(e.getName()))
//                        .findFirst()
//                        .orElse(null);
//            }
//
//            @Override
//            public Object @NotNull [] getVariants() {
//                // Optional: provide code completion options
//                return PsiTreeUtil.findChildrenOfType(getElement().getContainingFile(), MCBasicNamedElement.class)
//                        .stream()
//                        .map(PsiNamedElement::getName)
//                        .filter(Objects::nonNull)
//                        .toArray();
//            }
//        };
    }

}
