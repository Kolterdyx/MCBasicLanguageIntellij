package me.kolterdyx.mcbasiclanguage;

import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicBaseValue;
import org.jetbrains.annotations.NotNull;


public class MCBasicReferenceContributor extends PsiReferenceContributor {

    private static final MCBasicReferenceContributor INSTANCE = new MCBasicReferenceContributor();

    MCBasicReferenceContributor() {
        MCBasicLogger.log("MCBasicReferenceContributor initialized.");
        MCBasicLogger.log("Registering reference providers...");
    }

    @Override
    public void registerReferenceProviders(@NotNull PsiReferenceRegistrar registrar) {
        MCBasicLogger.log("Registering reference providers...");
        registrar.registerReferenceProvider(
                PlatformPatterns.psiElement(),
                new PsiReferenceProvider() {
                    @Override
                    public PsiReference @NotNull [] getReferencesByElement(@NotNull PsiElement element,
                                                                           @NotNull ProcessingContext context) {
                        MCBasicLogger.log("Registering reference for element: " + element.getText());
                        if (element.getParent() instanceof MCBasicBaseValue) {
                            return new PsiReference[]{new MCBasicReference(element)};
                        }
                        return PsiReference.EMPTY_ARRAY;
                    }
                }
        );
    }
}
