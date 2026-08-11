# OSOYOO Smart Home Dashboard 📱💻🌐

[![Language: EN](https://img.shields.io/badge/Language-English-red.svg)](./README.md)
[![Language: KO](https://img.shields.io/badge/Language-한국어-lightgrey.svg)](./README.ko.md)
[![Language: JA](https://img.shields.io/badge/Language-日本語-lightgrey.svg)](./README.ja.md)

A cross-platform client for monitoring and controlling the OSOYOO Smart Home IoT system, built with **Compose Multiplatform**.

## 🌟 Features

- **Cross-Platform:** Single codebase targeting Android, Desktop (JVM), and Web (Wasm).
- **Responsive Design:** Adaptive UI that works seamlessly across different screen sizes.

## 📱 Platform Support

| Platform | Support Version |
| :--- | :--- |
| **Android** | API 24+ (Android 7.0+) |
| **iOS** | iOS 18.2+ |
| **Desktop** | Windows, macOS, Linux (JVM 17+) |
| **Web** | Chrome, Firefox, Safari (Wasm/JS) |

## 🛠️ Project Structure

This is a Kotlin Multiplatform project organized as follows:

- **[:shared](./shared/src):** Core business logic, networking, and shared Compose UI components.
  - `commonMain`: Shared logic and UI.
  - `androidMain` / `jvmMain` / `wasmJsMain`: Platform-specific implementations.
- **[:androidApp](./androidApp):** Entry point for the Android application.
- **[:iosApp](./iosApp):** Entry point for the iOS application (SwiftUI).
- **[:desktopApp](./desktopApp):** Entry point for the Desktop (JVM) application.
- **[:webApp](./webApp):** Entry point for the Web (Wasm) application.

## 🚀 Getting Started

### Prerequisites

- **Android Studio** (Koala or newer recommended)
- **Xcode 16.2+** (for iOS 18.2 support)
- **JDK 17** or higher

### Running the Applications

Use the **Kotlin Multiplatform** plugin in Android Studio (Run Configurations) or the following Gradle commands:

- **Android:** `./gradlew :androidApp:assembleDebug`
- **iOS:** Open `client/iosApp/iosApp.xcodeproj` in Xcode or run via the IDE.
- **Desktop:** `./gradlew :desktopApp:run`
- **Web (JS):** `./gradlew :webApp:jsBrowserDevelopmentRun`
- **Web (Wasm):** `./gradlew :webApp:wasmJsBrowserDevelopmentRun`

## 🧪 Testing

- **All Platforms:** `./gradlew :shared:allTests`
- **Android:** `./gradlew :shared:testAndroidHostTest`
- **iOS:** `./gradlew :shared:iosSimulatorArm64Test`
- **Desktop:** `./gradlew :shared:jvmTest`
- **Web (JS):** `./gradlew :shared:jsBrowserTest`
- **Web (Wasm):** `./gradlew :shared:wasmJsBrowserTest`

---
