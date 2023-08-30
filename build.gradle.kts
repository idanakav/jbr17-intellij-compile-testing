plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.15.0"
    kotlin("jvm") version "1.9.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

kotlin {
    jvmToolchain(17)
}

intellij {
    version.set("2023.1")
    type.set("IU")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.google.testing.compile:compile-testing:0.21.0")
    testImplementation("com.google.guava:guava:32.1.2-jre")
    testImplementation("com.google.truth:truth:1.1.4")

}

tasks.test {
    useJUnitPlatform()
}