
plugins {
    application
}

group = "org.gradle.kotlin.dsl.samples.composite-builds"
version = "1.0"

/**
 * TODO: configura el plugin `application` para que ejecute la clase `cli.Main`
 */
application {
    mainClass.set("cli.Main")
}

/**
 * TODO: añade la dependencia `composite-builds:core:1.0` que apunta al proyecto `core`
 */
dependencies {
    implementation("composite-builds:core:1.0")
}
