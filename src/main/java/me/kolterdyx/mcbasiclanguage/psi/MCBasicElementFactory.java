
package me.kolterdyx.mcbasiclanguage.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import me.kolterdyx.mcbasiclanguage.MCBasicFileType;

public class MCBasicElementFactory {

    public static MCBasicFile createFile(Project project, String text) {
        String name = "dummy.mcb";
        return (MCBasicFile) PsiFileFactory.getInstance(project).createFileFromText(name, MCBasicFileType.INSTANCE, text);
    }

    public static MCBasicFunctionDeclaration createFunction(Project project, String name) {
        MCBasicFile file = createFile(project, "func " + name + "() {}");
        var child = file.getFirstChild().getNode().findChildByType(MCBasicTypes.FUNCTION_DECLARATION);
        if (child == null) {
            return null;
        }

        return (MCBasicFunctionDeclaration) MCBasicNameIndex.registerElement(name, (MCBasicFunctionDeclaration) child.getPsi());
    }

    public static MCBasicVariableDeclaration createVariable(Project project, String name) {
        MCBasicFile file = createFile(project, "let " + name + " int = 0");
        var child = file.getFirstChild().getNode().findChildByType(MCBasicTypes.VARIABLE_DECLARATION);
        if (child == null) {
            return null;
        }
        return (MCBasicVariableDeclaration) MCBasicNameIndex.registerElement(name, (MCBasicVariableDeclaration) child.getPsi());
    }

    public static MCBasicStructDeclaration createStruct(Project project, String name) {
        MCBasicFile file = createFile(project, "struct " + name + " { }");
        var child = file.getFirstChild().getNode().findChildByType(MCBasicTypes.STRUCT_DECLARATION);
        if (child == null) {
            return null;
        }
        return (MCBasicStructDeclaration) MCBasicNameIndex.registerElement(name, (MCBasicStructDeclaration) child.getPsi());
    }

}
