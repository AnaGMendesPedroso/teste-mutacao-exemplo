import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    id("info.solidsoft.pitest") version ("1.5.1")
}

group = "mutation.test"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11


repositories {
    mavenCentral()
}


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.11.1")
}

pitest {
    junit5PluginVersion.set("0.13")
    avoidCallsTo.set(setOf("kotlin.jvm.internal"))
    mutators.set(setOf("STRONGER"))
    targetClasses.set(setOf("${project.group}.*"))
    targetTests.set(setOf("${project.group}.*Test"))
    threads.set(Runtime.getRuntime().availableProcessors())
    outputFormats.set(setOf("HTML"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}