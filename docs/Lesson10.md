## Lesson 10: 炎検知 (Flame Detection)

### 1. 目的 (Objective)

このレッスンでは、インターネットを利用してリモートの火災センサーの状態を監視する方法を紹介する。
Arduino MEGA2560ボードはWebサーバーとして機能し、リモートブラウザはこのウェブサーバーにアクセスし、火災センサーのリアルタイムの状態を表示できる。

### 2. 必要部品とデバイス

- OSOYOO MEGA2560ボード ×1
- OSOYOO MEGA-IoT 拡張ボード ×1
- 赤色LED PnPモジュール ×1
- 緑色LED PnPモジュール ×1
- 炎検知センサー PnPモジュール ×1
- ブザーモジュール ×1
- 3ピン PnP ケーブル ×4
- USB ケーブル ×1
- PC ×1

### 3. 作り方 (How to Make)

1. OSOYOO MEGA2560ボードの上にOSOYOO MEGA-IoT拡張ボードを差し込む。  
    （ジャンパーキャップは、ESP8266のRXとA8、TXとA9を接続するようにする）
2. 緑色LEDモジュール -- D12
   赤色LEDモジュール -- D11 (※D13にした)
   ブザーモジュール -- D5  
   炎検知センサー -- A1

### 4. コーディング (How to Code)

- Step 1: 最新のArduino IDEをインストール。（スキップ）
- Step 2: WiFiEsp-master ライブラリインストール。（スキップ）  
- Step 3: 以下のリンクからメインコードをダウンロードし、ZIPファイルを解凍する。（スキップ）
  http://osoyoo.com/driver/smarthome/smarthome-lesson10.zip
- Step 4: OSOYOO MEGA2560ボードをUSBケーブルでPCに接続する。  
- Step 5: Arduino IDEを開き、プロジェクトに適したボードタイプとポートタイプを選択する。
- Step 6: Arduino IDE: 「File → Open → "smarthome-lesson10"」を選択して、Arduinoにスケッチをアップロードする。
  - 注意: スケッチ内の以下の行を見つけて、WiFiのSSIDとパスワードを自分のネットワークに合わせて変更する。  
  ```cpp
  char ssid[] = "****"; // WiFiのSSIDを入力
  char pass[] = "****"; // WiFiのパスワードを入力
  ```

### 5. 実行方法 (How to Play)

**注意：プラスドライバーを使用して、ポテンショメータ（可変抵抗器）を回し、炎検知モジュールの感度を調整する。
火がない状態では、モジュールの緑色のライトが点灯するように調整する必要がある。**

スケッチをArduinoに読み込んだ後、Arduino IDEの右上にあるシリアルモニタを開くと、以下の結果が表示さる。  

- シリアルモニタから、MEGA2560ボードのIPアドレスを確認できる。

ブラウザを使用してウェブサイトにアクセスすると、
火災信号が検出されていない場合、MEGA-IoTシールドのD13ピンにある赤色LEDは消灯し、緑色LEDが点灯する。
次に、ガスライターを使用してセンサーにガスを吹きかけて、炎がセンサーに赤外線(IR)信号を誘発する。
IoTシールドの緑色LEDが消灯し、赤色LEDが点灯して、ブザーが鳴るのが確認できる。

|      |                      Web                      |              Smart Home              |
|------|:---------------------------------------------:|:------------------------------------:|
| Fire | ![web_fire.png](assets/lesson10/web_fire.png) | [fire.mp4](assets/lesson10/fire.mp4) |
| Safe | ![web_safe.png](assets/lesson10/web_safe.png) | [safe.mp4](assets/lesson10/safe.mp4) |
