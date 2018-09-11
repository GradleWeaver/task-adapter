allprojects {
    repositories {
        jcenter()
    }

    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
    }
}

subprojects {
    plugins.withId("java-library") {
        dependencies {
            "testImplementation"(group = "org.junit.jupiter", name = "junit-jupiter-params", version = "5.3.0")
        }
    }
}

tasks.withType<Wrapper>().configureEach {
    gradleVersion = "4.10"
    distributionType = Wrapper.DistributionType.ALL
}
