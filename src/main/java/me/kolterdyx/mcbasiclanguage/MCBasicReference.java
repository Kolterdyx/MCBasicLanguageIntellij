package me.kolterdyx.mcbasiclanguage;

import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.psi.util.PsiTreeUtil;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicNamedElement;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MCBasicReference extends PsiPolyVariantReferenceBase<PsiElement> {


    public MCBasicReference(@NotNull PsiElement element) {
        super(element, TextRange.from(0, element.getTextLength()));
    }

    @Override
    public Object @NotNull [] getVariants() {
        PsiFile file = myElement.getContainingFile();
        Collection<MCBasicNamedElement> elements =
                PsiTreeUtil.findChildrenOfType(file, MCBasicNamedElement.class);

        return elements.stream()
                .map(el -> LookupElementBuilder.create(el).withTypeText(el.getClass().getSimpleName()))
                .toArray();
    }

    @Override
    public PsiElement resolve() {
        String refName = getValue();

        MCBasicLogger.log("Resolving " + refName);

        // Traverse up the PSI tree to find the scope, then search for matching named elements.
        PsiFile file = myElement.getContainingFile();
        return PsiTreeUtil.findChildrenOfType(file, MCBasicNamedElement.class).stream()
                .filter(el -> refName.equals(el.getName()))
                .findFirst()
                .orElse(null);
    }


    @Override
    public ResolveResult @NotNull [] multiResolve(boolean incompleteCode) {
        String refName = getValue();

        MCBasicLogger.log("MultiResolving " + refName);

        PsiFile file = myElement.getContainingFile();
        Collection<MCBasicNamedElement> candidates =
                PsiTreeUtil.findChildrenOfType(file, MCBasicNamedElement.class);

        List<ResolveResult> results = new ArrayList<>();
        for (MCBasicNamedElement element : candidates) {
            if (refName.equals(element.getName())) {
                results.add(new PsiElementResolveResult(element));
            }
        }

        return results.toArray(ResolveResult.EMPTY_ARRAY);
    }
}
