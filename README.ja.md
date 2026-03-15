# OSOYOO スマートホーム IoT プロジェクト 🏠

[![Language: EN](https://img.shields.io/badge/Language-English-lightgrey.svg)](./README.md)
[![Language: KO](https://img.shields.io/badge/Language-한국어-lightgrey.svg)](./README.ko.md)
[![Language: JA](https://img.shields.io/badge/Language-日本語-red.svg)](./README.ja.md)

## 📌 プロジェクト概要

このプロジェクトは、[OSOYOO スマートホーム IoT 学習キット](https://osoyoo.com/2019/10/18/osoyoo-smart-home-iot-learning-kit-with-mega2560-introduction/)を通じて、IoT システム全般をマスターする過程を記録したものです。センサーの仕組みの理解から、スマートホーム自動化の実装まで、深い学習を目的としています。

## 🚀 主な学習目標

- **IoT コア技術の習得:** 様々なセンサーのデータ収集原理とアクチュエータの制御ロジックを深く学習します。
- **スマートホーム自動化の実装:** 火災検知、セキュリティアラーム、環境制御など、実生活に応用可能な自動化シナリオを構築します。
- **エンジニアリング能力の強化:** ハードウェアスケッチをモジュール化されたソフトウェア構造へ昇華させ、体系的な技術ドキュメント化を実践します。

## 🛠️ 技術スタック

- **ハードウェア:** Arduino Mega 2560, OSOYOO Smart Home Kit
- **言語:** C++ (Arduino Sketch)
- **バージョン管理:** Git / GitHub (Gitmoji 準拠)

## 📂 フォルダ構成

```
osoyoo-smart-home-iot/
├── firmware/          # [Embedded] Arduinoソースおよびライブラリ
│   ├── sample/        # レッスン別サンプルコード (.ino)
│   └── src/           # 実習およびリファクタリングコード
│   └── library/       # プロジェクト必須ライブラリ
└── docs/              # 回路図、センサー仕様書、および動作エビデンス資料
```

## 📖 ロードマップ

[OSOYOO 公式チュートリアル](https://osoyoo.com/2019/10/18/osoyoo-smart-home-iot-learning-kit-with-mega2560-introduction/)の各レッスンに沿って、段階的に IoT を学習します：

1. **[Step 1] 基礎と組立:** IoTの概念理解およびモデルの組み立て (Lesson 1-2)
2. **[Step 2] 基本入出力制御:** LED、ブザー、温湿度センサーなどの制御 (Lesson 3-7)
3. **[Step 3] 高度なセンサー活用:** サーボモーター、ガス/炎/音/光センサーおよびLCD出力 (Lesson 8-14)
4. **[Step 4] システム統合:** リレー制御、RFIDセキュリティおよび最終プロジェクト (Lesson 15-19)

### ✅ レッスン・チェックリスト
- [x] **Lesson 1:** モノのインターネット (Internet of Things)
- [x] **Lesson 2:** モデルの組み立て (Model Installation)
- [x] **Lesson 3:** ハローワールド (Hello World)
- [x] **Lesson 4:** リモート制御LED (Remote Control LED)
- [x] **Lesson 5:** RGBモジュール (RGB Module)
- [x] **Lesson 6:** アクティブブザー (Active Buzzer)
- [x] **Lesson 7:** DHT11温湿度センサー (DHT11 Sensor)
- [x] **Lesson 8:** ドアの開閉制御 (Switching Door)
- [ ] **Lesson 9:** ガス検知 (Gas Detection)
- [ ] **Lesson 10:** 炎検知 (Flame Detection)
- [ ] **Lesson 11:** サウンドセンサー (Sound Sensor)
- [ ] **Lesson 12:** 光センサー (Light Sensor)
- [ ] **Lesson 13:** PIR動体検知 (PIR Motion Detection)
- [ ] **Lesson 14:** LCDスクリーン (LCD Screen)
- [ ] **Lesson 15:** 1チャンネルリレー (1-Channel Relay)
- [ ] **Lesson 16:** RFIDドア開閉システム (RFID Switching Door)
- [ ] **Lesson 17:** 人間の動きの追跡 (Tracing Human Movement)
- [ ] **Lesson 18:** 2台のMega-IoTデバイス連携 (Two Mega-IoT Devices)
- [ ] **Lesson 19:** IoTキャップストーンプロジェクト (IoT Capstone Project)
