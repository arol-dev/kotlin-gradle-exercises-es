plugins {
    `kotlin-dsl`
}

/**
 * TODO: Llama a la función `gradlePlugin` para registrar un nuevo plugin de Gradle.
 *  en este deberás registrar un plugin con el id `greet` y la implementación de la clase `GreetPlugin`.
 */
gradlePlugin {
    plugins {
        register("greet-plugin") {
            id = "greet"
            implementationClass = "GreetPlugin"
        }
    }
}

repositories {
    mavenCentral()
}
