import org.gradle.api.*
import org.gradle.api.tasks.*
import org.gradle.kotlin.dsl.*

/**
 * TODO: Define la clase HelloTask que extiende de DefaultTask.
 *  Esta debe definir un método (@TaskAction) que imprima el nombre
 *  del proyecto.
 */
open class HelloTask : DefaultTask() {

    init {
        group = "My"
        description = "Prints a description of ${project.name}."
    }

    @TaskAction
    fun run() {
        println("I'm ${project.name}")
    }
}

/**
 * TODO: Define una extensión de Project llamada withHelloTask que
 *  defina una tarea llamada "hello" de tipo HelloTask.
 *
 */
fun Project.withHelloTask() =
    tasks.register("hello", HelloTask::class)

