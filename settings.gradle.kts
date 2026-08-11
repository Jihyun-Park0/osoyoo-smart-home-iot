rootProject.name = "osoyoo-smart-home-iot"

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

include(":androidApp")
project(":androidApp").projectDir = file("client/androidApp")

include(":desktopApp")
project(":desktopApp").projectDir = file("client/desktopApp")

include(":shared")
project(":shared").projectDir = file("client/shared")

include(":webApp")
project(":webApp").projectDir = file("client/webApp")
