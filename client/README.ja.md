# OSOYOO スマートホームダッシュボード 📱💻🌐

[![Language: EN](https://img.shields.io/badge/Language-English-lightgrey.svg)](./README.md)
[![Language: KO](https://img.shields.io/badge/Language-한국어-lightgrey.svg)](./README.ko.md)
[![Language: JA](https://img.shields.io/badge/Language-日本語-red.svg)](./README.ja.md)

**Compose Multiplatform** で構築された、OSOYOO スマートホーム IoT システムを監視および制御するためのクロスプラットフォームクライアントです。

## 🌟 主な機能

- **クロスプラットフォーム:** Android、Desktop (JVM)、Web (Wasm) をターゲットとする単一のコードベース。
- **レスポンシブデザイン:** さまざまな画面サイズでシームレスに動作するアダプティブ UI。

## 📱 プラットフォームサポート

| プラットフォーム | サポートバージョン |
| :--- | :--- |
| **Android** | API 24+ (Android 7.0+) |
| **iOS** | iOS 18.2+ |
| **Desktop** | Windows, macOS, Linux (JVM 17+) |
| **Web** | Chrome, Firefox, Safari (Wasm/JS 対応ブラウザ) |

## 🛠️ プロジェクト構造

このプロジェクトは、次のように構成された Kotlin Multiplatform プロジェクトです。

- **[:shared](./shared/src):** コアビジネスロジック、ネットワーキング、および共有 Compose UI コンポーネント。
  - `commonMain`: 共有ロジックと UI。
  - `androidMain` / `jvmMain` / `wasmJsMain`: プラットフォーム固有の実装。
- **[:androidApp](./androidApp):** Android アプリケーションのエントリーポイント。
- **[:iosApp](./iosApp):** iOS アプリケーション (SwiftUI) のエントリーポイント。
- **[:desktopApp](./desktopApp):** Desktop (JVM) アプリケーションのエントリーポイント。
- **[:webApp](./webApp):** Web (Wasm) アプリケーションのエントリーポイント。

## 🚀 はじめに

### 前提条件

- **Android Studio** (Koala 以降を推奨)
- **Xcode 16.2+** (iOS 18.2 サポート用)
- **JDK 17** 以上

### アプリケーションの実行

Android Studio の **Kotlin Multiplatform** プラグイン（実行構成）または次の Gradle コマンドを使用します。

- **Android:** `./gradlew :androidApp:assembleDebug`
- **iOS:** Xcode で `client/iosApp/iosApp.xcodeproj` を開くか、IDE を通じて実行します。
- **Desktop:** `./gradlew :desktopApp:run`
- **Web (JS):** `./gradlew :webApp:jsBrowserDevelopmentRun`
- **Web (Wasm):** `./gradlew :webApp:wasmJsBrowserDevelopmentRun`

## 🧪 テスト

- **全プラットフォーム:** `./gradlew :shared:allTests`
- **Android:** `./gradlew :shared:testAndroidHostTest`
- **iOS:** `./gradlew :shared:iosSimulatorArm64Test`
- **Desktop:** `./gradlew :shared:jvmTest`
- **Web (JS):** `./gradlew :shared:jsBrowserTest`
- **Web (Wasm):** `./gradlew :shared:wasmJsBrowserTest`

---
