package me.kolterdyx.mcbasiclanguage.stub.impl;
import me.kolterdyx.mcbasiclanguage.psi.impl.MCBasicStructDeclarationImpl;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicNamedStub;
import org.jetbrains.annotations.NotNull;

public class MCBasicStructDeclarationStubElementType extends MCBasicStubElementMixin {

    public MCBasicStructDeclarationStubElementType(@NotNull String debugName) {
        super(debugName);
    }

    @Override
    public @NotNull MCBasicStructDeclarationImpl createPsi(@NotNull MCBasicNamedStub stub) {
        return new MCBasicStructDeclarationImpl(stub, this);
    }

    @Override
    public @NotNull String getExternalId() {
        return "mcbasic.struct";
    }
}
