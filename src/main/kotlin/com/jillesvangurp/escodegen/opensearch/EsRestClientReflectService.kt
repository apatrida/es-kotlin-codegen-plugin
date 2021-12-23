package com.jillesvangurp.escodegen.opensearch


import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner

private const val esClientPackage = "org.opensearch.client"

class EsRestClientReflectService(val classLoader: ClassLoader = Thread.currentThread().contextClassLoader) {
    fun listCLientClasses(): List<Class<*>> {
        val reflections = Reflections(esClientPackage, SubTypesScanner(false))
        return reflections.allTypes.filter {
            it.endsWith("Client") &&
                    // two exceptions
                    !it.startsWith("org.opensearch.client.Client") &&
                    !it.endsWith("RestClient")
        }.map { classLoader.loadClass(it) }
    }
}
