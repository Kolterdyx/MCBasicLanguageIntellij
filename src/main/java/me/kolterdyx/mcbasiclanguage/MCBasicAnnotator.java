package me.kolterdyx.mcbasiclanguage;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicFunctionDeclaration;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicStructDeclaration;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicVariableDeclaration;
import org.jetbrains.annotations.NotNull;

public class MCBasicAnnotator implements Annotator {

    @Override
    public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        switch (psiElement) {
            case MCBasicFunctionDeclaration functionDeclaration -> {
                annotateFunctionDeclaration(annotationHolder, functionDeclaration);
            }
            case MCBasicVariableDeclaration variableDeclaration -> {
                annotateVariableDeclaration(annotationHolder, variableDeclaration);
            }
            case MCBasicStructDeclaration structDeclaration -> {
                annotateStructDeclaration(annotationHolder, structDeclaration);
            }
            default -> {
            }
        }
    }

    private static void annotateStructDeclaration(@NotNull AnnotationHolder annotationHolder, MCBasicStructDeclaration structDeclaration) {
        PsiElement nameIdentifier = structDeclaration.getNameIdentifier();
        if (nameIdentifier != null) {
            annotationHolder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                    .range(nameIdentifier.getTextRange())
                    .textAttributes(MCBasicSyntaxHighlighter.STRUCT_DECLARATION)
                    .create();
        }
    }

    private static void annotateVariableDeclaration(@NotNull AnnotationHolder annotationHolder, MCBasicVariableDeclaration variableDeclaration) {
        PsiElement nameIdentifier = variableDeclaration.getNameIdentifier();
        if (nameIdentifier != null) {
            annotationHolder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                    .range(nameIdentifier.getTextRange())
                    .textAttributes(MCBasicSyntaxHighlighter.VARIABLE_DECLARATION)
                    .create();
        }
    }

    private static void annotateFunctionDeclaration(@NotNull AnnotationHolder annotationHolder, MCBasicFunctionDeclaration functionDeclaration) {
        PsiElement nameIdentifier = functionDeclaration.getNameIdentifier();
        if (nameIdentifier == null) {
            return;
        }
        if (functionDeclaration.getStatementList().isEmpty()) {
            annotationHolder.newAnnotation(HighlightSeverity.WEAK_WARNING, "Function is empty")
                    .range(nameIdentifier.getTextRange())
                    .create();
        }
        annotationHolder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                .range(nameIdentifier.getTextRange())
                .textAttributes(MCBasicSyntaxHighlighter.FUNCTION_DECLARATION)
                .create();
    }
}
