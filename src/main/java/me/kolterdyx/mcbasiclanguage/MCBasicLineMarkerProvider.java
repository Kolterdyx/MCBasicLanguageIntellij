package me.kolterdyx.mcbasiclanguage;

import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo;
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider;
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLiteralExpression;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicFunctionDeclaration;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicNamedElement;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

public class MCBasicLineMarkerProvider extends RelatedItemLineMarkerProvider {
    @Override
    protected void collectNavigationMarkers(@NotNull PsiElement element,
                                            @NotNull Collection<? super RelatedItemLineMarkerInfo<?>> result) {
        if (!(element.getParent() instanceof MCBasicNamedElement namedElement)) {
            return;
        }
        MCBasicLogger.log("Collecting navigation markers for element: " + namedElement.getName());

        Project project = element.getProject();
        String possibleProperties = namedElement.getName();
        final List<MCBasicNamedElement> functions = MCBasicUtil.findElements(project, possibleProperties);
        MCBasicLogger.log("Found " + functions.size() + " definitions for: " + possibleProperties);
        if (!functions.isEmpty()) {
            NavigationGutterIconBuilder<PsiElement> builder =
                    NavigationGutterIconBuilder.create(MCBasicIcons.FILE)
                            .setTargets(functions)
                            .setTooltipText("Navigate to declaration");
            result.add(builder.createLineMarkerInfo(element));
        }
    }
}
