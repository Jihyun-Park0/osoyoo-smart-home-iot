## Lesson 4: リモートLED制御 (Remote Control LED)

### 1. 目的 (Objective)

このレッスンでは、簡単なIoT（Internet of Things）プロジェクトを作成する方法を紹介する。  
リモートブラウザからLEDをオン/オフにするプロジェクト。  
Arduino MEGA2560ボードはWebサーバーとして機能し、リモートブラウザはこのWebサーバーにアクセスし、MEGA2560のD13ピンに接続されたLEDを制御できる。

### 2. 必要部品とデバイス

- OSOYOO MEGA2560ボード ×1
- OSOYOO MEGA-IoT 拡張ボード ×1
- LED PnP モジュール ×1
- OSOYOO 3ピン PnP ケーブル ×1
- USB ケーブル ×1
- PC ×1

### 3. 作り方 (How to Make)

1. OSOYOO MEGA2560ボードの上にOSOYOO MEGA-IoT拡張ボードを差し込む。
2. 3ピンPnPケーブルを使用して、LEDモジュールをOSOYOO MEGA-IoT Extension BoardのD13ポートに接続する。  
   （ジャンパーキャップは、ESP8266のRXとA8、TXとA9を接続するようにする）

### 4. コーディング (How to Code)

- Step 1: 最新のArduino IDEをインストール。（スキップ）
- Step 2: WiFiEsp-master ライブラリインストール。（スキップ）
- Step 3: 以下のリンクからメインコードをダウンロードし、ZIPファイルを解凍する。（スキップ）
  http://osoyoo.com/driver/smarthome/smarthome-lesson4.zip
- Step 4: OSOYOO MEGA2560ボードをUSBケーブルでPCに接続する。  
- Step 5: Arduino IDEを開き、プロジェクトに適したボードタイプとポートタイプを選択する。
- Step 7: Arduino IDE: 「File → Open → "smarthome-lesson4"」を選択して、Arduinoにスケッチをアップロードする。
  - 注意: スケッチ内の以下の行を見つけて、WiFiのSSIDとパスワードを自分のネットワークに合わせて変更する。  
  ```cpp
  char ssid[] = "****"; // WiFiのSSIDを入力
  char pass[] = "****"; // WiFiのパスワードを入力
  ```

### 5. 実行方法 (How to Play)

スケッチをArduinoに読み込んだ後、Arduino IDEの右上にあるシリアルモニタを開くと、以下の結果が表示さる。  

- シリアルモニタから、MEGA2560ボードのIPアドレスを確認できる。

次に、ブラウザを使用してウェブサイトにアクセスし、2つのリンクをクリックすると、IoT Shieldを介してMEGA2560に接続されているLEDモジュールをオン/オフにできる。

|                     LED ON                      |                          LED OFF                          |
|:-----------------------------------------------:|:---------------------------------------------------------:|
| ![led_on.png](/docs/assets/lesson04/led_on.png) | ![web_led_off.png](/docs/assets/lesson04/web_led_off.png) |
| ![led_on.png](/docs/assets/lesson04/led_on.png) |  ![web_led_on.png](/docs/assets/lesson04/web_led_on.png)  |
