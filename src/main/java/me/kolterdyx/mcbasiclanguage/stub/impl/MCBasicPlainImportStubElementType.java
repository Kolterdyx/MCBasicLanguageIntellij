package me.kolterdyx.mcbasiclanguage.stub.impl;
import me.kolterdyx.mcbasiclanguage.psi.impl.MCBasicPlainImportImpl;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicNamedStub;
import org.jetbrains.annotations.NotNull;

public class MCBasicPlainImportStubElementType extends MCBasicStubElementMixin {

    public MCBasicPlainImportStubElementType(@NotNull String debugName) {
        super(debugName);
    }

    @Override
    public @NotNull MCBasicPlainImportImpl createPsi(@NotNull MCBasicNamedStub stub) {
        return new MCBasicPlainImportImpl(stub, this);
    }

    @Override
    public @NotNull String getExternalId() {
        return "mcbasic.import";
    }
}
