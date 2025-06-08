// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package me.kolterdyx.mcbasiclanguage.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import me.kolterdyx.mcbasiclanguage.MCBasicFileType;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicFile;
import me.kolterdyx.mcbasiclanguage.psi.MCBasicProperty;

public class MCBasicElementFactory {

  public static MCBasicProperty createProperty(Project project, String name) {
    final MCBasicFile file = createFile(project, name);
    return (MCBasicProperty) file.getFirstChild();
  }

  public static MCBasicFile createFile(Project project, String text) {
    String name = "dummy.simple";
    return (MCBasicFile) PsiFileFactory.getInstance(project).createFileFromText(name, MCBasicFileType.INSTANCE, text);
  }

  public static MCBasicProperty createProperty(Project project, String name, String value) {
    final MCBasicFile file = createFile(project, name + " = " + value);
    return (MCBasicProperty) file.getFirstChild();
  }

  public static PsiElement createCRLF(Project project) {
    final MCBasicFile file = createFile(project, "\n");
    return file.getFirstChild();
  }

}
