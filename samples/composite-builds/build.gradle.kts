/**
 * TODO: Añade una tarea `run` que dependa de la tarea `:cli:run`
 */
tasks {
    register("run") {
        dependsOn(gradle.includedBuild("cli").task(":run"))
        group = "Application"
        description = "Runs the :cli project :run task"
    }
}
