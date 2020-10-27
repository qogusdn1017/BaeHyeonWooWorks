plugins {
    kotlin("jvm") version "1.4.0"
}

group = "com.github.qogusdn1017"
version = "0.1"

repositories {
    mavenCentral()
    maven(url = "https://papermc.io/repo/repository/maven-public/") // Paper
    maven(url = "https://jitpack.io/") // JitPack
}

dependencies {
    implementation(kotlin("stdlib-jdk8")) // Kotlin
    implementation("com.destroystokyo.paper:paper-api:1.16.2-R0.1-SNAPSHOT") // Paper
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }
    javadoc {
        options.encoding = "UTF-8"
    }
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    processResources {
        filesMatching("**/*.yml") {
            expand(project.properties)
        }
    }
    create<Copy>("distJar") {
        from(jar)
        into(".\\")
    }
}