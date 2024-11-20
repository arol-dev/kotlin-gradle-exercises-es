import org.gradle.api.Project

import org.gradle.kotlin.dsl.*

/**
 * TODO: Definimos una extension de Project.kotlinProject para agregar
 *  las dependencias necesarias (en este caso solo kotlin-stdlib).
 *  Para ello, utiliza el metodo Project.dependencies.add().
 */
fun Project.kotlinProject() {
    dependencies {
        add("implementation", kotlin("stdlib"))
    }
}
