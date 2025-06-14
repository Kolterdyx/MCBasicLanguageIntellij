package me.kolterdyx.mcbasiclanguage.stub.impl;

import me.kolterdyx.mcbasiclanguage.psi.impl.MCBasicFunctionDeclarationImpl;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicNamedStub;
import org.jetbrains.annotations.NotNull;

public class MCBasicFunctionDeclarationStubElementType extends MCBasicStubElementMixin {

    public MCBasicFunctionDeclarationStubElementType(@NotNull String debugName) {
        super(debugName);
    }

    @Override
    public @NotNull MCBasicFunctionDeclarationImpl createPsi(@NotNull MCBasicNamedStub stub) {
        return new MCBasicFunctionDeclarationImpl(stub, this);
    }

    @Override
    public @NotNull String getExternalId() {
        return "mcbasic.function";
    }

}