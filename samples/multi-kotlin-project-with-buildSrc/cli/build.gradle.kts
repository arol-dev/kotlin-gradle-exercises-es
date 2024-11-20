plugins {
    application
    kotlin("jvm")
}

/**
 * TODO: Ejecutamos la funcion kotlinProject() para agregar las dependencias
 */
kotlinProject()

application {
    mainClass.set("cli.Main")
}

dependencies {
    implementation(project(":core"))
}
