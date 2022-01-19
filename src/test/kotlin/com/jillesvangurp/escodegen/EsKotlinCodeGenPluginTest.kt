/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.jillesvangurp.escodegen

import org.gradle.testfixtures.ProjectBuilder
import kotlin.test.Test
import kotlin.test.assertNotNull

class EsKotlinCodeGenPluginTest {
    @Test fun `plugin registers task`() {
        // Create a test project and apply the plugin
        val project = ProjectBuilder.builder().build()
        project.plugins.apply("com.github.apatrida.codegen")

        // Verify the result
        assertNotNull(project.tasks.findByName("codegen"))
    }
}
