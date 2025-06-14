package me.kolterdyx.mcbasiclanguage.stub;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicNamedElement;

public class MCBasicNamedStub extends StubBase<MCBasicNamedElement> implements StubElement<MCBasicNamedElement> {
    private final String name;

    public MCBasicNamedStub(StubElement parent, IStubElementType type, String name) {
        super(parent, type);
        System.out.println("Creating MCBasicNamedStub with name: " + name);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
