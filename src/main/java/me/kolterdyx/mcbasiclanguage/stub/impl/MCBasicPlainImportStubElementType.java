package me.kolterdyx.mcbasiclanguage.stub.impl;
import me.kolterdyx.mcbasiclanguage.psi.impl.MCBasicPlainImportImpl;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicNamedStubElement;
import org.jetbrains.annotations.NotNull;

public class MCBasicPlainImportStubElementType extends MCBasicStubElementType {

    public MCBasicPlainImportStubElementType(@NotNull String debugName) {
        super(debugName);
    }

    @Override
    public @NotNull MCBasicPlainImportImpl createPsi(@NotNull MCBasicNamedStubElement stub) {
        return new MCBasicPlainImportImpl(stub, this);
    }

    @Override
    public @NotNull String getExternalId() {
        return "mcbasic.import";
    }
}
