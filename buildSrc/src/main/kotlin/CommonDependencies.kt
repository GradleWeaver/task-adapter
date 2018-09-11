import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.create

fun DependencyHandler.gradleLegacy() =
        create(group = "org.gradle", name = "gradle-core", version = "2.14.1")
