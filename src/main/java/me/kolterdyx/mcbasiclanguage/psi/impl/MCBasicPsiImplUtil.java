package me.kolterdyx.mcbasiclanguage.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import me.kolterdyx.mcbasiclanguage.psi.*;


public class MCBasicPsiImplUtil {

    /* Universal */
    public static String getName(MCBasicNamedElement namedElement) {
        ASTNode nameNode = namedElement.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        return nameNode != null ? nameNode.getText() : null;
    }

    public static PsiElement setName(MCBasicNamedElement element, String newName) {
        PsiElement identifier = element.getNameIdentifier();
        if (identifier != null) {
            PsiElement newId = MCBasicElementFactory.createIdentifier(element.getProject(), newName);
            if (newId != null) {
                identifier.replace(newId);
            }
        }
        return element;
    }

    public static PsiElement getNameIdentifier(MCBasicNamedElement element) {
        ASTNode keyNode = element.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        return keyNode != null ? keyNode.getPsi() : null;
    }

    /* Function declaration */
    public static String getName(MCBasicFunctionDeclaration functionDeclaration) {
        return getName((MCBasicNamedElement) functionDeclaration);
    }

    public static PsiElement setName(MCBasicFunctionDeclaration element, String newName) {
        return setName((MCBasicNamedElement) element, newName);
    }

    public static PsiElement getNameIdentifier(MCBasicFunctionDeclaration element) {
        return getNameIdentifier((MCBasicNamedElement) element);
    }


    /* Variables */
    public static String getName(MCBasicVariableDeclaration variableDeclaration) {
        return getName((MCBasicNamedElement) variableDeclaration);
    }

    public static PsiElement setName(MCBasicVariableDeclaration element, String newName) {
        return setName((MCBasicNamedElement) element, newName);
    }

    public static PsiElement getNameIdentifier(MCBasicVariableDeclaration element) {
       return getNameIdentifier((MCBasicNamedElement) element);
    }

    /* Structs */
    public static String getName(MCBasicStructDeclaration structDeclaration) {
        return getName((MCBasicNamedElement) structDeclaration);
    }

    public static PsiElement setName(MCBasicStructDeclaration element, String newName) {
        return setName((MCBasicNamedElement) element, newName);
    }

    public static PsiElement getNameIdentifier(MCBasicStructDeclaration element) {
        return getNameIdentifier((MCBasicNamedElement) element);
    }

}
