package me.kolterdyx.mcbasiclanguage.stub;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicNamedElement;

public class MCBasicNamedStubElement extends StubBase<MCBasicNamedElement> implements StubElement<MCBasicNamedElement> {
    private final String name;

    public MCBasicNamedStubElement(StubElement parent, IStubElementType type, String name) {
        super(parent, type);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
