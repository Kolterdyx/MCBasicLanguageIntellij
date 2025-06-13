package me.kolterdyx.mcbasiclanguage.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiTreeUtil;
import me.kolterdyx.mcbasiclanguage.psi.*;


public class MCBasicPsiImplUtil {

    private static PsiElement findFirstByType(PsiElement element, IElementType type) {
        System.out.println("Element type: " + element.getNode().getElementType());
        if (element.getNode().getElementType() == type) {
            return element;
        }
        for (PsiElement child : element.getChildren()) {
            PsiElement result = findFirstByType(child, type);
            if (result != null) {
                return result;
            }
        }
        System.out.println("No identifier found in: " + element.getText());
        return null;
    }

    /* Function declaration */
    public static String getName(MCBasicFunctionDeclaration functionDeclaration) {
        ASTNode functionNameNode = functionDeclaration.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        return functionNameNode != null ? functionNameNode.getText() : null;
    }

    public static PsiElement setName(MCBasicFunctionDeclaration element, String newName) {
        PsiElement identifier = element.getNameIdentifier();
        if (identifier != null) {
            PsiElement newId = MCBasicElementFactory.createIdentifier(element.getProject(), newName);
            if (newId != null) {
                identifier.replace(newId);
            }
        }
        return element;
    }

    public static PsiElement getNameIdentifier(MCBasicFunctionDeclaration element) {
        return element.getFirstChild();
    }


    /* Variables */
    public static String getName(MCBasicVariableDeclaration variableDeclaration) {
        ASTNode variableNameNode = variableDeclaration.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        return variableNameNode != null ? variableNameNode.getText() : null;
    }

    public static PsiElement setName(MCBasicVariableDeclaration element, String newName) {
        PsiElement identifier = element.getNameIdentifier();
        if (identifier != null) {
            PsiElement newId = MCBasicElementFactory.createIdentifier(element.getProject(), newName);
            if (newId != null) {
                identifier.replace(newId);
            }
        }
        return element;
    }

    public static PsiElement getNameIdentifier(MCBasicVariableDeclaration element) {
        return element.getFirstChild();
    }

    /* Structs */
    public static String getName(MCBasicStructDeclaration structDeclaration) {
        ASTNode structNameNode = structDeclaration.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        return structNameNode != null ? structNameNode.getText() : null;
    }

    public static PsiElement setName(MCBasicStructDeclaration element, String newName) {
        PsiElement identifier = element.getNameIdentifier();
        if (identifier != null) {
            PsiElement newId = MCBasicElementFactory.createIdentifier(element.getProject(), newName);
            if (newId != null) {
                identifier.replace(newId);
            }
        }
        return element;
    }

    public static PsiElement getNameIdentifier(MCBasicStructDeclaration element) {
        return element.getFirstChild();
    }

    /* Parameters */
    public static String getName(MCBasicParameter parameter) {
        ASTNode parameterNameNode = parameter.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        return parameterNameNode != null ? parameterNameNode.getText() : null;
    }

    public static PsiElement setName(MCBasicParameter element, String newName) {
        PsiElement identifier = element.getNameIdentifier();
        if (identifier != null) {
            PsiElement newId = MCBasicElementFactory.createIdentifier(element.getProject(), newName);
            if (newId != null) {
                identifier.replace(newId);
            }
        }
        return element;
    }

    public static PsiElement getNameIdentifier(MCBasicParameter element) {
        return element.getFirstChild();
    }

}
