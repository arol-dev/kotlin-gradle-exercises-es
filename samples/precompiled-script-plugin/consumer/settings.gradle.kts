/**
 * TODO: llamamos a `pluginManagement` para agregar un nuevo repositorio Maven.
 *  Configuramos un repositorio maven con url `uri("../plugin/build/repository")`.
 */
pluginManagement {
    repositories {
        maven { url = uri("../plugin/build/repository") }
    }
}
