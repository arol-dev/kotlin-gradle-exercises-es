/**
 * TODO: Haz un `includeBuild` para añadir el proyecto `core` al composite build
 *     y configura la dependencia `composite-builds:core` para que apunte al proyecto `core`
 */
includeBuild("core") {
    dependencySubstitution {
        substitute(module("composite-builds:core")).using(project(":"))
    }
}

/**
 * TODO: Haz un `includeBuild` para añadir el proyecto `cli` al composite build.
 */
includeBuild("cli")
