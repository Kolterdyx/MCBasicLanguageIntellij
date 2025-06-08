package me.kolterdyx.mcbasiclanguage.psi.stubs;

import com.intellij.psi.stubs.StubElement;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicFunctionDeclaration;

public interface FunctionStub extends StubElement<MCBasicFunctionDeclaration> {
    String getName();
}
