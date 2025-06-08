package me.kolterdyx.mcbasiclanguage;

import com.intellij.openapi.project.Project;
import me.kolterdyx.mcbasiclanguage.psi.*;
import java.util.List;

public class MCBasicUtil {

    public static List<MCBasicNamedElement> findElements(Project project, String name) {
        return MCBasicNameIndex.findElements(name);
    }

}
