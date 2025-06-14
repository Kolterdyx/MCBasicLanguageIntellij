package me.kolterdyx.mcbasiclanguage;

import com.intellij.openapi.project.Project;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndex;
import com.intellij.psi.stubs.StubIndexKey;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicNamedElement;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class MCBasicSymbolIndex extends StringStubIndexExtension<MCBasicNamedElement> {

    public static final MCBasicSymbolIndex INSTANCE = new MCBasicSymbolIndex();

    public static final StubIndexKey<String, MCBasicNamedElement> KEY =
            StubIndexKey.createIndexKey("mcbasic.symbol.index");

    private MCBasicSymbolIndex() {}


    @Override
    public @NotNull StubIndexKey<String, MCBasicNamedElement> getKey() {
        return KEY;
    }

    @Override
    public @NotNull Collection<MCBasicNamedElement> get(@NotNull String name,
                                                        @NotNull Project project,
                                                        @NotNull GlobalSearchScope scope) {
        return StubIndex.getElements(KEY, name, project, scope, MCBasicNamedElement.class);
    }
}