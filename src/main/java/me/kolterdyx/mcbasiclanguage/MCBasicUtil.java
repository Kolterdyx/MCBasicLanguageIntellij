package me.kolterdyx.mcbasiclanguage;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicNamedElement;

import java.util.Collection;

public class MCBasicUtil {

    /**
     * Resolves a reference by searching the current file for matching named elements.
     * Only resolves to in-scope elements (can be expanded later).
     */
    public static PsiElement resolve(PsiElement reference) {
        if (!(reference instanceof MCBasicNamedElement)) {
            return null;
        }

        String name = ((MCBasicNamedElement) reference).getName();
        if (name == null) {
            return null;
        }

        PsiFile file = reference.getContainingFile();
        Collection<MCBasicNamedElement> candidates =
                PsiTreeUtil.findChildrenOfType(file, MCBasicNamedElement.class);

        for (MCBasicNamedElement candidate : candidates) {
            if (name.equals(candidate.getName())) {
                return candidate;
            }
        }

        return null; // Not found
    }
}
