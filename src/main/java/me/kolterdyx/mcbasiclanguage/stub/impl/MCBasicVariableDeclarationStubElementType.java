package me.kolterdyx.mcbasiclanguage.stub.impl;
import me.kolterdyx.mcbasiclanguage.psi.impl.MCBasicVariableDeclarationImpl;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicNamedStubElement;
import org.jetbrains.annotations.NotNull;

public class MCBasicVariableDeclarationStubElementType extends MCBasicStubElementType {

    public MCBasicVariableDeclarationStubElementType(@NotNull String debugName) {
        super(debugName);
    }

    @Override
    public @NotNull MCBasicVariableDeclarationImpl createPsi(@NotNull MCBasicNamedStubElement stub) {
        return new MCBasicVariableDeclarationImpl(stub, this);
    }

    @Override
    public @NotNull String getExternalId() {
        return "mcbasic.variable";
    }
}
