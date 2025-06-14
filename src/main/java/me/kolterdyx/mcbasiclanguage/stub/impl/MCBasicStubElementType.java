package me.kolterdyx.mcbasiclanguage.stub.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.*;
import me.kolterdyx.mcbasiclanguage.MCBasicLanguage;
import me.kolterdyx.mcbasiclanguage.MCBasicSymbolIndex;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicNamedElement;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicNamedStubElement;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public abstract class MCBasicStubElementType extends IStubElementType<MCBasicNamedStubElement, MCBasicNamedElement> {

    public MCBasicStubElementType(@NotNull @NonNls String debugName) {
        super(debugName, MCBasicLanguage.INSTANCE);
    }

    @Override
    public @NotNull MCBasicNamedStubElement createStub(@NotNull MCBasicNamedElement psi, StubElement<? extends PsiElement> parentStub) {
        return new MCBasicNamedStubElement(parentStub, this, psi.getName());
    }

    @Override
    public void serialize(@NotNull MCBasicNamedStubElement stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getName());
    }

    @Override
    public @NotNull MCBasicNamedStubElement deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        String name = dataStream.readNameString();
        return new MCBasicNamedStubElement(parentStub, this, name);
    }

    @Override
    public void indexStub(@NotNull MCBasicNamedStubElement stub, @NotNull IndexSink sink) {
        String name = stub.getName();
        if (name != null) {
            sink.occurrence(MCBasicSymbolIndex.KEY, name);
        }
    }

    @Override
    public boolean shouldCreateStub(ASTNode node) {
        return true;
    }
}
