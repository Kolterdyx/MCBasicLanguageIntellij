package me.kolterdyx.mcbasiclanguage.stub.impl;

import me.kolterdyx.mcbasiclanguage.psi.impl.MCBasicParameterImpl;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicNamedStubElement;
import org.jetbrains.annotations.NotNull;

public class MCBasicParameterStubElementType  extends MCBasicStubElementType {
    public MCBasicParameterStubElementType(@NotNull String debugName) {
        super(debugName);
    }

    @Override
    public @NotNull MCBasicParameterImpl createPsi(@NotNull MCBasicNamedStubElement stub) {
        return new MCBasicParameterImpl(stub, this);
    }

    @Override
    public @NotNull String getExternalId() {
        return "mcbasic.parameter";
    }
}
