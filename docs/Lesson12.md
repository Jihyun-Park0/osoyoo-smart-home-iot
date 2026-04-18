## Lesson 12: 光センサー (Light Sensor)

### 1. 目的 (Objective)

このレッスンでは、インターネットを利用してリモートの光センサーの状態を監視する方法を紹介する。
Arduino MEGA2560ボードはWebサーバーとして機能し、リモートブラウザはこのウェブサーバーにアクセスし、光センサーのリアルタイムの状態を表示できる。

### 2. 必要部品とデバイス

- OSOYOO MEGA2560ボード ×1
- OSOYOO MEGA-IoT 拡張ボード ×1
- USB ケーブル ×1
- 赤色LED PnPモジュール ×1
- 緑色LED PnPモジュール ×1
- 光センサー PnPモジュール ×1
- ブザーモジュール ×1
- 3ピン PnP ケーブル ×4

### 3. 作り方 (How to Make)

1. OSOYOO MEGA2560ボードの上にOSOYOO MEGA-IoT拡張ボードを差し込む。  
    （ジャンパーキャップは、ESP8266のRXとA8、TXとA9を接続するようにする）
2. 緑色LEDモジュール -- D12
   赤色LEDモジュール -- D11 (※D13にした)
   ブザーモジュール -- D5
   光センサー -- A0

### 4. コーディング (How to Code)

- Step 1: 最新のArduino IDEをインストール。（スキップ）
- Step 2: WiFiEsp-master ライブラリインストール。（スキップ）  
- Step 3: 以下のリンクからメインコードをダウンロードし、ZIPファイルを解凍する。（スキップ）
  http://osoyoo.com/driver/smarthome/smarthome-lesson12.zip
- Step 4: OSOYOO MEGA2560ボードをUSBケーブルでPCに接続する。  
- Step 5: Arduino IDEを開き、プロジェクトに適したボードタイプとポートタイプを選択する。
- Step 6: Arduino IDE: 「File → Open → "smarthome-lesson12"」を選択して、Arduinoにスケッチをアップロードする。
  - 注意: スケッチ内の以下の行を見つけて、WiFiのSSIDとパスワードを自分のネットワークに合わせて変更する。  
  ```cpp
  char ssid[] = "****"; // WiFiのSSIDを入力
  char pass[] = "****"; // WiFiのパスワードを入力
  ```

### 5. 実行方法 (How to Play)

スケッチをArduinoに読み込んだ後、Arduino IDEの右上にあるシリアルモニタを開くと、以下の結果が表示さる。  

- シリアルモニタから、MEGA2560ボードのIPアドレスを確認できる。

ブラウザを使用してウェブサイトにアクセスすると、
手で光センサーを覆って光を完全に遮った場合、MEGA-IoTシールドのD13ピンにある赤色LEDは消灯し、緑色LEDが点灯する。
次に、光センサーを光源にさらすと、IoTシールドの緑色LEDが消灯し、赤色LEDが点灯して、ブザーが鳴るのが確認できる。

|                |                                Web                                |                         Smart Home                          |
|----------------|:-----------------------------------------------------------------:|:-----------------------------------------------------------:|
| No Light       |       ![web_no_light.png](assets/lesson12/web_no_light.png)       |       ![no_light.jpeg](assets/lesson12/no_light.jpeg)       |
| Light Detected | ![web_light_detected.png](assets/lesson12/web_light_detected.png) | ![light_detected.jpeg](assets/lesson12/light_detected.jpeg) |
