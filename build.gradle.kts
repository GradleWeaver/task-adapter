

allprojects {
    repositories {
        jcenter()
    }
}

tasks.withType<Wrapper>().configureEach {
    gradleVersion = "4.10"
    distributionType = Wrapper.DistributionType.ALL
}
