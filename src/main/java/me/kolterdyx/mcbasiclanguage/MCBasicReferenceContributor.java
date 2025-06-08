package me.kolterdyx.mcbasiclanguage;

import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicBaseValue;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicFunctionDeclaration;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class MCBasicReferenceContributor extends PsiReferenceContributor {
    @Override
    public void registerReferenceProviders(@NotNull PsiReferenceRegistrar registrar) {
        registrar.registerReferenceProvider(
                PlatformPatterns.psiElement().withLanguage(MCBasicLanguage.INSTANCE),
                new PsiReferenceProvider() {
                    @Override
                    public PsiReference @NotNull [] getReferencesByElement(@NotNull PsiElement element, @NotNull ProcessingContext context) {
                        if (element instanceof MCBasicBaseValue baseValue) {
                            PsiElement nameIdentifier = baseValue.getNameIdentifier();
                            if (nameIdentifier == null) {
                                return PsiReference.EMPTY_ARRAY;
                            }
                            return new PsiReference[]{new MCBasicReference(element, nameIdentifier.getTextRange())};
                        }
                        return PsiReference.EMPTY_ARRAY;
                    }
                }
        );
    }
}
