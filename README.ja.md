# OSOYOO スマートホーム IoT プロジェクト 🏠

[![Language: EN](https://img.shields.io/badge/Language-English-lightgrey.svg)](./README.md)
[![Language: KO](https://img.shields.io/badge/Language-한국어-lightgrey.svg)](./README.ko.md)
[![Language: JA](https://img.shields.io/badge/Language-日本語-red.svg)](./README.ja.md)

## 📌 プロジェクト概要

このプロジェクトは、[OSOYOO スマートホーム IoT キット](https://osoyoo.com/2019/10/18/osoyoo-smart-home-iot-learning-kit-with-mega2560-introduction/)を中心とした統合**スマートホーム・エコシステム**です。マルチプラットフォーム対応のダッシュボードを通じて、ハードウェアのセンサーやアクチュエータをリアルタイムで監視・制御します。

## 🚀 主な目標

- **マルチプラットフォーム統合制御:** Compose Multiplatform を活用した Android, iOS, Desktop, Web 統合ダッシュボードの構築。
- **ハードウェアとソフトウェアのシナジー:** Arduino ベースのファームウェアとモダンなクライアントアプリ間のシームレスな連携。
- **エンジニアリング能力の向上:** C++ と Kotlin のコードベース全体におけるクリーンでモジュール化されたアーキテクチャの実践。

## 🛠️ 技術スタック

- **ハードウェア:** Arduino Mega 2560, OSOYOO Smart Home Kit
- **ファームウェア:** C++ (Arduino Sketch)
- **クライアント (ダッシュボード):** Kotlin Multiplatform (Compose Multiplatform)
    - **対応プラットフォーム:** Android, iOS, Desktop (JVM), Web (Wasm)
- **バージョン管理:** Git / GitHub (Gitmoji 準拠)

## 📂 フォルダ構成

```
osoyoo-smart-home-iot/
├── firmware/          # [Embedded] Arduinoソースおよびライブラリ
│   ├── sample/        # レッスン別サンプルコード (.ino)
│   ├── src/           # 実習およびリファクタリングコード
│   └── library/       # プロジェクト必須ライブラリ
├── client/            # [Mobile/Desktop/Web] Compose Multiplatform ダッシュボード
│   ├── androidApp/    # Android アプリ実装
│   ├── iosApp/        # iOS アプリ実装
│   ├── desktopApp/    # Desktop (JVM) アプリ実装
│   ├── webApp/        # Web (Wasm) アプリ実装
│   └── shared/        # 共通ビジネスロジックおよびUIコンポーネント
└── docs/              # 回路図、センサー仕様書、および動作エビデンス資料
```

> [!TIP]
> ダッシュボードアプリケーションの詳細については、**[クライアント README](./client/README.ja.md)** を参照してください。

## 📖 ロードマップと進捗状況

初期の IoT 学習フェーズは完了しました。詳細なカリキュラムのロードマップとレッスンごとの進捗状況については、以下を参照してください：
👉 **[IoT 学習の軌跡カリキュラム (CURRICULUM.ja.md)](./docs/CURRICULUM.ja.md)**

### 現在のフォーカス: Phase 2 - スマートホーム・ダッシュボード 🚀
ハードウェアと連携するマルチプラットフォーム・クライアントを構築中です。開発の進捗状況は GitHub Project で確認できます：
👉 **[スマートホーム・ダッシュボード・プロジェクト](https://github.com/users/Jihyun-Park0/projects/2)**
