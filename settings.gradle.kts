rootProject.name = "es-kotlin-codegen-plugin"

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

plugins {
    id("de.fayard.refreshVersions") version "0.23.0"
////                            # available:"0.30.0"
////                            # available:"0.30.1"
}

refreshVersions {
//    extraArtifactVersionKeyRules(file("version_key_rules.txt"))
}
