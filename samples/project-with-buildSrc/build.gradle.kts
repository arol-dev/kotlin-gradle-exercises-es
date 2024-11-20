/**
 * TODO: Instala el plugin `my-plugin` que hemos definido anteriormente.
 */
plugins {
    // Apply the `my-plugin` defined in buildSrc/src/main/kotlin/my-plugin.gradle.kts
    `my-plugin`
}

/**
 * TODO: Configura la extension `my` para que la propiedad `flag` sea `true`.
 */
my {
    flag.set(true)
}

/**
 * TODO: Aplica la extensión `withHelloTask` a este proyecto.
 */
withHelloTask()

/**
 * TODO: (Opcional) Define una tarea llamada `printProfile` que imprima el valor de la propiedad `profile` y ejecute la
 *  función `logProfile` definida en el archivo `buildSrc/src/main/kotlin/extensions.kt`.
 *  Piensa que ya hemos instalado el plugin.
 */
tasks.register("printProfile") {
    description = "Uses the extension property and the extension functions defined in buildSrc. Use with -Pprofile=prod."
    group = "sample"

    doLast {
        println("The current profile is $profile")
        logProfile()
    }
}
