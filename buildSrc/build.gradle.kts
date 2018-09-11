import org.jetbrains.kotlin.gradle.dsl.KotlinCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompile

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.2.61"
    `kotlin-dsl`
}


repositories {
    mavenCentral()
}
dependencies {
    compile(kotlin("stdlib-jdk8", "1.2.61"))
}

tasks.withType<KotlinJvmCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
