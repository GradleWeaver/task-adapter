plugins {
    id("com.diffplug.gradle.spotless") version "3.14.0"
}

val ktLintVersion = "0.28.0"

allprojects {
    apply {
        plugin("com.diffplug.gradle.spotless")
    }

    repositories {
        jcenter()
    }

    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
    }

    spotless {
        kotlinGradle {
            ktlint(ktLintVersion)
        }
    }
}

subprojects {
    plugins.withId("java-library") {
        dependencies {
            "testImplementation"(group = "org.junit.jupiter", name = "junit-jupiter-params", version = "5.3.0")
        }

        spotless {
            kotlin {
                ktlint(ktLintVersion)
            }
        }
    }
}

tasks.withType<Wrapper>().configureEach {
    gradleVersion = "4.10"
    distributionType = Wrapper.DistributionType.ALL
}
