# OSOYOO 스마트 홈 대시보드 📱💻🌐

[![Language: EN](https://img.shields.io/badge/Language-English-lightgrey.svg)](./README.md)
[![Language: KO](https://img.shields.io/badge/Language-한국어-blue.svg)](./README.ko.md)
[![Language: JA](https://img.shields.io/badge/Language-日本語-lightgrey.svg)](./README.ja.md)

**Compose Multiplatform**으로 제작된 OSOYOO 스마트 홈 IoT 시스템을 모니터링하고 제어하기 위한 크로스 플랫폼 클라이언트입니다.

## 🌟 주요 기능

- **크로스 플랫폼:** Android, Desktop (JVM), Web (Wasm)을 대상으로 하는 단일 코드베이스입니다.
- **반응형 디자인:** 다양한 화면 크기에서 원활하게 작동하는 적응형 UI입니다.

## 📱 플랫폼 지원

| 플랫폼 | 지원 버전 |
| :--- | :--- |
| **Android** | API 24+ (Android 7.0+) |
| **iOS** | iOS 18.2+ |
| **Desktop** | Windows, macOS, Linux (JVM 17+) |
| **Web** | Chrome, Firefox, Safari (Wasm/JS 지원 브라우저) |

## 🛠️ 프로젝트 구조

이 프로젝트는 다음과 같이 구성된 Kotlin Multiplatform 프로젝트입니다:

- **[:shared](./shared/src):** 핵심 비즈니스 로직, 네트워킹 및 공유 Compose UI 컴포넌트입니다.
  - `commonMain`: 공유 로직 및 UI입니다.
  - `androidMain` / `jvmMain` / `wasmJsMain`: 플랫폼별 구현체입니다.
- **[:androidApp](./androidApp):** Android 애플리케이션의 엔트리 포인트입니다.
- **[:iosApp](./iosApp):** iOS 애플리케이션(SwiftUI)의 엔트리 포인트입니다.
- **[:desktopApp](./desktopApp):** Desktop (JVM) 애플리케이션의 엔트리 포인트입니다.
- **[:webApp](./webApp):** Web (Wasm) 애플리케이션의 엔트리 포인트입니다.

## 🚀 시작하기

### 사전 요구 사항

- **Android Studio** (Koala 이상 권장)
- **Xcode 16.2+** (iOS 18.2 지원용)
- **JDK 17** 이상

### 애플리케이션 실행

Android Studio의 **Kotlin Multiplatform** 플러그인(실행 구성) 또는 다음 Gradle 명령을 사용하세요:

- **Android:** `./gradlew :androidApp:assembleDebug`
- **iOS:** Xcode에서 `client/iosApp/iosApp.xcodeproj`를 열거나 IDE를 통해 실행하세요.
- **Desktop:** `./gradlew :desktopApp:run`
- **Web (JS):** `./gradlew :webApp:jsBrowserDevelopmentRun`
- **Web (Wasm):** `./gradlew :webApp:wasmJsBrowserDevelopmentRun`

## 🧪 테스트

- **모든 플랫폼:** `./gradlew :shared:allTests`
- **Android:** `./gradlew :shared:testAndroidHostTest`
- **iOS:** `./gradlew :shared:iosSimulatorArm64Test`
- **Desktop:** `./gradlew :shared:jvmTest`
- **Web (JS):** `./gradlew :shared:jsBrowserTest`
- **Web (Wasm):** `./gradlew :shared:wasmJsBrowserTest`

---
