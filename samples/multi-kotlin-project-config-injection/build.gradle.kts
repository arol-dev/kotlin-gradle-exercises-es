import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

/**
 * TODO: Añade el plugin `kotlin("jvm")` con la versión "1.9.25", pero haz que no se aplique.
 *  Añade también el plugin `base`.
 */
plugins {
    base
    kotlin("jvm") version "1.9.25" apply false
}

/**
 * TODO: Utilizando el método `allprojects`, configura el grupo y la versión de todos los proyectos
 *  y haz que el repositorio sea Maven Central.
 */
allprojects {

    group = "org.gradle.kotlin.dsl.samples.multiprojectci"
    version = "1.0"

    repositories {
        mavenCentral()
    }
}

/**
 * TODO: Utilizando el método `subprojects`, configura el compilador de Kotlin para que no muestre
 *  por pantalla que esta configurando cada subproyecto.
 *  Deberás usar el método `tasks.withType<KotlinCompile>().configureEach` para configurar cada
 *  tarea de compilación de Kotlin.
 *  Una vez en cada subproyecto, inyecta la configuración con `kotlinOptions` para que
 *  no muestre warnings y el target sea la versión 13 de Java.
 */
subprojects {
    tasks.withType<KotlinCompile>().configureEach {
        println("Configuring $name in project ${project.name}...")
        kotlinOptions {
            suppressWarnings = true
            jvmTarget = "13"
        }
    }
}
