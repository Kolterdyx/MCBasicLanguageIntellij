
plugins {
  id("java")
  id("org.jetbrains.intellij.platform") version "2.6.0"
}

group = "me.kolterdyx"
version = "0.0.1"

// Include the generated files in the source set
sourceSets {
  main {
    java {
      srcDirs("src/main/gen")
    }
  }
}

repositories {
  mavenCentral()

  intellijPlatform {
    defaultRepositories()
  }
}

dependencies {
  intellijPlatform {
    intellijIdeaCommunity("2024.2.6")
    bundledPlugin("com.intellij.java")

  }
}

intellijPlatform {
  buildSearchableOptions = false

  pluginConfiguration {
    ideaVersion {
      sinceBuild = "242"
    }
  }
  pluginVerification  {
    ides {
      recommended()
    }
  }
}
