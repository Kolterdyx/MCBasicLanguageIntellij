package me.kolterdyx.mcbasiclanguage.stub.impl;
import me.kolterdyx.mcbasiclanguage.psi.impl.MCBasicPlainImportImpl;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicImportStubElement;
import org.jetbrains.annotations.NotNull;

public class MCBasicPlainImportStubElementType extends MCBasicImportStubElementType {

    public MCBasicPlainImportStubElementType(@NotNull String debugName) {
        super(debugName);
    }

    @Override
    public MCBasicPlainImportImpl createPsi(@NotNull MCBasicImportStubElement stub) {
        return new MCBasicPlainImportImpl(stub, this);
    }

}
