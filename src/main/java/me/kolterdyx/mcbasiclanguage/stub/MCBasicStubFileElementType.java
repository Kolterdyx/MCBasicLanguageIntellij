package me.kolterdyx.mcbasiclanguage.stub;

import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.tree.IStubFileElementType;
import me.kolterdyx.mcbasiclanguage.MCBasicLanguage;
import org.jetbrains.annotations.NotNull;

public class MCBasicStubFileElementType extends IStubFileElementType<MCBasicStubFile> {
    public MCBasicStubFileElementType() {
        super("MCBasic File", MCBasicLanguage.INSTANCE);
    }

    @Override
    public @NotNull String getExternalId() {
        return "mcbasic.file";
    }
}
