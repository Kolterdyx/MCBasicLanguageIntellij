package me.kolterdyx.mcbasiclanguage.stub.impl;

import me.kolterdyx.mcbasiclanguage.psi.impl.MCBasicFunctionDeclarationImpl;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicNamedStubElement;
import org.jetbrains.annotations.NotNull;

public class MCBasicFunctionDeclarationStubElementType extends MCBasicStubElementType {

    public MCBasicFunctionDeclarationStubElementType(@NotNull String debugName) {
        super(debugName);
    }

    @Override
    public @NotNull MCBasicFunctionDeclarationImpl createPsi(@NotNull MCBasicNamedStubElement stub) {
        return new MCBasicFunctionDeclarationImpl(stub, this);
    }

    @Override
    public @NotNull String getExternalId() {
        return "mcbasic.function";
    }

}