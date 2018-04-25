import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import java.io.*

val kotlinVersion = "1.2.40"

group = "org.ice1000.julia.devkt.lang"
version = "v1.2-SNAPSHOT"

plugins {
	java
	application
	kotlin("jvm") version "1.2.40"
}

java {
	sourceCompatibility = JavaVersion.VERSION_1_8
	targetCompatibility = JavaVersion.VERSION_1_8
}

java.sourceSets {
	"main" {
		java.setSrcDirs(listOf("src"))
		withConvention(KotlinSourceSet::class) {
			kotlin.setSrcDirs(listOf("src"))
		}
		resources.setSrcDirs(listOf("res"))
	}

	"test" {
		java.setSrcDirs(emptyList<Any>())
		withConvention(KotlinSourceSet::class) {
			kotlin.setSrcDirs(emptyList<Any>())
		}
		resources.setSrcDirs(emptyList<Any>())
	}
}

application {
	mainClassName = "org.ice1000.devkt.Main"
}

repositories {
	mavenCentral()
	jcenter()
	maven("https://jitpack.io")
}

dependencies {
	compileOnly(kotlin("compiler-embeddable", kotlinVersion))
	val version = "67357db04d"
	compileOnly(group = "com.github.ice1000.dev-kt", name = "common", version = version)
	runtime(group = "com.github.ice1000.dev-kt", name = "swing", version = version)
}

