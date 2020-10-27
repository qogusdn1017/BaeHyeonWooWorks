plugins {
    kotlin("jvm") version "1.4.10"
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

group = "works.baehyeonwoo.paperserverlistpingdesign"
version = "0.1"

repositories {
    maven("https://repo.maven.apache.org/maven2/") // Maven
    maven("https://papermc.io/repo/repository/maven-public/") // PaperMC
    maven("https://jitpack.io/") // Jitpack
}

dependencies {
    implementation(kotlin("stdlib-jdk8")) // Kotlin
    implementation("junit:junit:4.12") // Junit
    implementation("com.destroystokyo.paper:paper-api:1.16.3-R0.1-SNAPSHOT") // Paper
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
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    processResources {
        filesMatching("**/*.yml") {
            expand(project.properties)
        }
    }
}