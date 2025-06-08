package me.kolterdyx.mcbasiclanguage.psi.impl;

import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicFunctionDeclaration;
import me.kolterdyx.mcbasiclanguage.psi.stubs.FunctionStub;

public class FunctionStubImpl extends StubBase<MCBasicFunctionDeclaration> implements FunctionStub {
    private final String name;

    public FunctionStubImpl(final StubElement parent, final String name) {
        super(parent, null);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
