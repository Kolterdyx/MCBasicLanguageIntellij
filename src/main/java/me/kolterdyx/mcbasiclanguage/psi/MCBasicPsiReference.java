package me.kolterdyx.mcbasiclanguage.psi;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import me.kolterdyx.mcbasiclanguage.MCBasicSymbolIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;


public class MCBasicPsiReference extends PsiReferenceBase<MCBasicElement> {

    public MCBasicPsiReference(@NotNull MCBasicElement element) {
        super(element, new TextRange(0, element.getTextLength()));
    }

    @Override
    public @Nullable PsiElement resolve() {
        String name = getValue();
        PsiFile file = getElement().getContainingFile();
        System.out.println("Resolving reference for: " + name);
        MCBasicSymbolIndex.INSTANCE.getAllKeys(myElement.getProject()).forEach(key -> {
            System.out.println("Index key: " + key);
        });
        return PsiTreeUtil.findChildrenOfType(file, MCBasicNamedElement.class)
                .stream()
                .filter(e -> name.equals(e.getName()))
                .findFirst()
                .orElse(null);
//        String name = getValue();
//        Project project = myElement.getProject();
//        return MCBasicSymbolIndex.INSTANCE.get(name, project, GlobalSearchScope.allScope(project))
//                .stream().findFirst().orElse(null);
    }

    @Override
    public Object @NotNull [] getVariants() {
//        Project project = myElement.getProject();
//        return MCBasicSymbolIndex.INSTANCE.getAllKeys(project).toArray();
        return PsiTreeUtil.findChildrenOfType(getElement().getContainingFile(), MCBasicNamedElement.class)
                .stream()
                .map(PsiNamedElement::getName)
                .filter(Objects::nonNull)
                .toArray();
    }
}