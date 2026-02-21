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
- `src/`: レッスンごとのステップバイステップのソースコード。
- `docs/`: 回路図、センサー仕様書、および動作エビデンス資料。

## 📖 ロードマップ

[OSOYOO 公式チュートリアル](https://osoyoo.com/2019/10/18/osoyoo-smart-home-iot-learning-kit-with-mega2560-introduction/)の各レッスンに沿って、段階的に IoT を学習します：

- **ステップ 1: 環境構築と基本出力** (Lesson 1-3)
  - Mega-IoT シールドの設置および基本的な入出力制御の学習。
- **ステップ 2: 環境データの収集** (Lesson 4-7, 12, 14, 17)
  - ガス、火災、温湿度、サウンドセンサー等を用いた環境情報の取得。
- **ステップ 3: アクチュエータと相互作用** (Lesson 8-10, 13)
  - LCD、キーパッド、サーボモーターを活用した UI の実装。
- **ステップ 4: ワイヤレス制御とセキュリティ** (Lesson 11, 15-16)
  - 赤外線リモコン制御および PIR、RFID ベースのセキュリティ構築。
- **ステップ 5: IoT ネットワークと Web サーバー** (Lesson 18-19)
  - WiFi 接続による遠隔監視および制御システムの完成。

### ✅ レッスン・チェックリスト
- [ ] **Lesson 1:** スマートホームキットの準備と設定
- [ ] **Lesson 2:** ボタンによるLED制御
- [ ] **Lesson 3:** ブザーを用いたアラームの実装
- [ ] **Lesson 4:** ガスセンサー (MQ-2) の活用
- [ ] **Lesson 5:** 火災検知センサーの活用
- [ ] **Lesson 6:** 照度センサー (光変換器) の活用
- [ ] **Lesson 7:** 温湿度センサー (DHT11) の活用
- [ ] **Lesson 8:** I2C LCDディスプレイの制御
- [ ] **Lesson 9:** サーボモーターの制御 (ドア開閉ロジック)
- [ ] **Lesson 10:** 4x4 キーパッドモジュールの入力
- [ ] **Lesson 11:** 赤外線(IR)リモコン制御
- [ ] **Lesson 12:** 水位センサーの活用
- [ ] **Lesson 13:** RGB LEDモジュールの制御
- [ ] **Lesson 14:** 土壌湿度センサーの活用
- [ ] **Lesson 15:** PIR 人感センサー (侵入検知)
- [ ] **Lesson 16:** RFIDモジュールによる入退室管理
- [ ] **Lesson 17:** サウンドセンサーの活用
- [ ] **Lesson 18:** ESP8266 WiFiシールドの接続
- [ ] **Lesson 19:** スマートホーム IoT Webサーバーの構築
