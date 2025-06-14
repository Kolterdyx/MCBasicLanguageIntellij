package me.kolterdyx.mcbasiclanguage.stub.impl;

import com.intellij.lang.Language;
import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.*;
import me.kolterdyx.mcbasiclanguage.MCBasicLanguage;
import me.kolterdyx.mcbasiclanguage.MCBasicSymbolIndex;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicImportElement;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicImportStatement;
import me.kolterdyx.mcbasiclanguage.psi.impl.MCBasicPlainImportImpl;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicImportStubElement;
import me.kolterdyx.mcbasiclanguage.stub.MCBasicNamedStubElement;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public abstract class MCBasicImportStubElementType extends IStubElementType<MCBasicImportStubElement, MCBasicImportElement> {

    public MCBasicImportStubElementType(@NotNull @NonNls String debugName) {
        super(debugName, MCBasicLanguage.INSTANCE);
    }

    @Override
    public @NotNull MCBasicImportStubElement createStub(@NotNull MCBasicImportElement mcBasicImportElement, StubElement<? extends PsiElement> stubElement) {
        MCBasicImportStatement statement = (MCBasicImportStatement) mcBasicImportElement.getParent().getNode().getPsi();
        System.out.println("Creating stub for import: " + mcBasicImportElement.getName() + " with path: " + statement.getImportPath().getText());
        return new MCBasicImportStubElement(stubElement, this, mcBasicImportElement.getName(), statement.getImportPath().getText());
    }

    @Override
    public @NotNull String getExternalId() {
        return "mcbasic.import";
    }

    @Override
    public void serialize(@NotNull MCBasicImportStubElement mcBasicImportStubElement, @NotNull StubOutputStream stubOutputStream) throws IOException {
        stubOutputStream.writeName(mcBasicImportStubElement.getName() + "::" + mcBasicImportStubElement.getImportPath());
    }

    @Override
    public @NotNull MCBasicImportStubElement deserialize(@NotNull StubInputStream stubInputStream, StubElement stubElement) throws IOException {
        String data = stubInputStream.readNameString();
        assert data != null;
        String[] parts = data.split("::");
        String name = parts[0];
        String importPath = parts.length > 1 ? parts[1] : null;
        return new MCBasicImportStubElement(stubElement, this, name, importPath);
    }

    @Override
    public void indexStub(@NotNull MCBasicImportStubElement mcBasicImportStubElement, @NotNull IndexSink indexSink) {
        String name = mcBasicImportStubElement.getName();
        if (name != null) {
            indexSink.occurrence(MCBasicSymbolIndex.KEY, name);
        }
        String importPath = mcBasicImportStubElement.getImportPath();
        if (importPath != null) {
            indexSink.occurrence(MCBasicSymbolIndex.KEY, importPath);
        }
    }
}
