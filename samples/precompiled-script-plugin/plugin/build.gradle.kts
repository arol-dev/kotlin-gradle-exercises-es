/**
 * TODO: Añadimos el plugin de maven-publish y kotlin-dsl.
 */
plugins {
    `kotlin-dsl`
    `maven-publish`
}


group = "my"
version = "1.0"

/**
 * TODO: Ejecutamos `publishing` para añadir un repositorio maven local.
 *  Para ello, ejecutamos `maven(url = "build/repository")`. Esto creará un repositorio
 *  maven en la carpeta `build/repository` del plugin.
 */
publishing {
    repositories {
        maven(url = "build/repository")
    }
}

repositories {
    mavenCentral()
}
