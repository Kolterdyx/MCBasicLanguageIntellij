package me.kolterdyx.mcbasiclanguage.stub;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;

public class MCBasicImportStubElement extends MCBasicNamedStubElement {

    private final String importPath;

    public MCBasicImportStubElement(StubElement parent, IStubElementType type, String name, String importPath) {
        super(parent, type, name);
        this.importPath = importPath;
    }


    public String getImportPath() {
        return importPath;
    }
}
