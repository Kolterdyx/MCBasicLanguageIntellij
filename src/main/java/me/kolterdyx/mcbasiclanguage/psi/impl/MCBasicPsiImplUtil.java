package me.kolterdyx.mcbasiclanguage.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import me.kolterdyx.mcbasiclanguage.psi.*;


public class MCBasicPsiImplUtil {
    /* Function declaration */
    public static String getName(MCBasicFunctionDeclaration functionDeclaration) {
        ASTNode functionNameNode = functionDeclaration.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        return functionNameNode != null ? functionNameNode.getText() : null;
    }

    public static PsiElement setName(MCBasicFunctionDeclaration element, String newName) {
        ASTNode nameNode = element.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        if (nameNode != null) {
            MCBasicFunctionDeclaration property = MCBasicElementFactory.createFunction(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(nameNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(MCBasicFunctionDeclaration element) {
        ASTNode keyNode = element.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        return keyNode != null ? keyNode.getPsi() : null;
    }


    /* Variables */
    public static String getName(MCBasicVariableDeclaration variableDeclaration) {
        ASTNode variableNameNode = variableDeclaration.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        return variableNameNode != null ? variableNameNode.getText() : null;
    }

    public static PsiElement setName(MCBasicVariableDeclaration element, String newName) {
        ASTNode nameNode = element.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        if (nameNode != null) {
            MCBasicVariableDeclaration property = MCBasicElementFactory.createVariable(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(nameNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(MCBasicVariableDeclaration element) {
        ASTNode keyNode = element.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        return keyNode != null ? keyNode.getPsi() : null;
    }

    /* Structs */
    public static String getName(MCBasicStructDeclaration structDeclaration) {
        ASTNode structNameNode = structDeclaration.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        return structNameNode != null ? structNameNode.getText() : null;
    }

    public static PsiElement setName(MCBasicStructDeclaration element, String newName) {
        ASTNode nameNode = element.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        if (nameNode != null) {
            MCBasicStructDeclaration property = MCBasicElementFactory.createStruct(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(nameNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(MCBasicStructDeclaration element) {
        ASTNode keyNode = element.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        return keyNode != null ? keyNode.getPsi() : null;
    }

    /* Base Values */
    public static String getName(MCBasicBaseValue baseValue) {
        ASTNode baseValueNameNode = baseValue.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        return baseValueNameNode != null ? baseValueNameNode.getText() : null;
    }

    public static PsiElement setName(MCBasicBaseValue element, String newName) {
        ASTNode nameNode = element.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        if (nameNode != null) {
            MCBasicBaseValue property = MCBasicElementFactory.createBaseValue(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(nameNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(MCBasicBaseValue element) {
        ASTNode keyNode = element.getNode().findChildByType(MCBasicTypes.IDENTIFIER);
        return keyNode != null ? keyNode.getPsi() : null;
    }

}
