package me.kolterdyx.mcbasiclanguage.psi.impl;

import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicElementFactory;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicImportElement;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicTypes;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicImportStubElement;
import org.jetbrains.annotations.NotNull;

public class MCBasicImportElementImpl  extends StubBasedPsiElementBase<MCBasicImportStubElement> implements MCBasicImportElement {
    public MCBasicImportElementImpl(@NotNull MCBasicImportStubElement stub, @NotNull IStubElementType<?, ?> nodeType) {
        super(stub, nodeType);
    }

    public MCBasicImportElementImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public String getImportPath() {
        return "";
    }

    @Override
    public PsiElement setName(@NotNull String name) {
        PsiElement identifier = getNameIdentifier();
        if (identifier != null) {
            PsiElement newId = MCBasicElementFactory.createIdentifier(getProject(), name);
            if (newId != null) {
                identifier.replace(newId);
            }
        }
        return this;
    }

    @Override
    public PsiElement getNameIdentifier() {
        return findChildByType(MCBasicTypes.IDENTIFIER);
    }
}
