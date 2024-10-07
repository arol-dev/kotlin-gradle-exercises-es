import org.gradle.api.Plugin
import org.gradle.api.Project

import org.gradle.kotlin.dsl.*

/**
 * TODO: Haz que la clase `GreetPlugin` implemente la interfaz `Plugin<Project>` de Gradle.
 *  Deberas implementar la función `apply` que recibe un proyecto y no retorna nada.
 *  En esta, registra una nueva tarea `greet` que implemente en el `doLast` la impresión
 *  del mensaje "I'm <nombre-del-proyecto>".
 */
class GreetPlugin: Plugin<Project> {

    override fun apply(project: Project): Unit = project.run {

        tasks {
            register("greet") {
                group = "sample"
                description = "Prints a description of ${project.name}."
                doLast {
                    println("I'm ${project.name}.")
                }
            }
        }
    }
}
