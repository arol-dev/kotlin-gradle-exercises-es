/**
 * TODO: Añade los plugins `application` y `kotlin("jvm")`.
 *  Además, configura application para que el mainClass sea `cli.Main`.
 */
plugins {
    application
    kotlin("jvm")
}

application {
    mainClass.set("cli.Main")
}

/**
 * TODO: Añade las dependencias kotlin("stdlib") y project(":core"). Esta última
 *  hace referencia al proyecto core de este multiproyecto.
 */
dependencies {
    implementation(project(":core"))
    implementation(kotlin("stdlib"))
}
