package me.kolterdyx.mcbasiclanguage.stub.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.*;
import me.kolterdyx.mcbasiclanguage.MCBasicLanguage;
import me.kolterdyx.mcbasiclanguage.MCBasicSymbolIndex;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicNamedElement;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicNamedStub;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public abstract class MCBasicStubElementMixin extends IStubElementType<MCBasicNamedStub, MCBasicNamedElement> {

    public MCBasicStubElementMixin(@NotNull @NonNls String debugName) {
        super(debugName, MCBasicLanguage.INSTANCE);
    }

    @Override
    public @NotNull MCBasicNamedStub createStub(@NotNull MCBasicNamedElement psi, StubElement<? extends PsiElement> parentStub) {
        System.out.println("2. Creating MCBasicNamedStub with name: " + psi.getName());
        return new MCBasicNamedStub(parentStub, this, psi.getName());
    }

    @Override
    public void serialize(@NotNull MCBasicNamedStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getName());
    }

    @Override
    public @NotNull MCBasicNamedStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        String name = dataStream.readNameString();
        return new MCBasicNamedStub(parentStub, this, name);
    }

    @Override
    public void indexStub(@NotNull MCBasicNamedStub stub, @NotNull IndexSink sink) {
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
