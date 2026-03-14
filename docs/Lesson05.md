## Lesson 5: RGBモジュール (RGB Module)

### 1. 目的 (Objective)

このレッスンでは、リモートブラウザからRGB LEDを制御する方法を紹介する。
Arduino MEGA2560ボードはWebサーバーとして機能し、リモートブラウザはこのWebサーバーにアクセスし、シールドのRGBインターフェースに接続されたRGBを制御できる。

### 2. 必要部品とデバイス

- OSOYOO MEGA2560ボード ×1
- OSOYOO MEGA-IoT 拡張ボード ×1
- USB ケーブル ×1
- RGB PnP モジュール ×1
- 4ピン PnP ケーブル ×1

### 3. 作り方 (How to Make)

1. OSOYOO MEGA2560ボードの上にOSOYOO MEGA-IoT拡張ボードを差し込む。
2. 4ピンPnPケーブルを使用して、RGB LEDモジュールをOSOYOO MEGA-IoTシールドのRGBポートに接続する。  
   （ジャンパーキャップは、ESP8266のRXとA8、TXとA9を接続するようにする）

### 4. コーディング (How to Code)

- Step 1: 最新のArduino IDEをインストール。（スキップ）
- Step 2: WiFiEsp-master ライブラリインストール。（スキップ）
- Step 3: 以下のリンクからメインコードをダウンロードし、ZIPファイルを解凍する。（スキップ）
  http://osoyoo.com/driver/smarthome/5/smarthome_lesson5.zip
- Step 4: OSOYOO MEGA2560ボードをUSBケーブルでPCに接続する。  
- Step 5: Arduino IDEを開き、プロジェクトに適したボードタイプとポートタイプを選択する。
- Step 6: Arduino IDE: 「File → Open → "smarthome-lesson5"」を選択して、Arduinoにスケッチをアップロードする。
  - 注意: スケッチ内の以下の行を見つけて、WiFiのSSIDとパスワードを自分のネットワークに合わせて変更する。  
  ```cpp
  char ssid[] = "****"; // WiFiのSSIDを入力
  char pass[] = "****"; // WiFiのパスワードを入力
  ```

### 5. 実行方法 (How to Play)

スケッチをArduinoに読み込んだ後、Arduino IDEの右上にあるシリアルモニタを開くと、以下の結果が表示さる。  

- シリアルモニタから、MEGA2560ボードのIPアドレスを確認できる。

次に、ブラウザを使用してウェブサイトにアクセスし、2つのリンクをクリックすると、IoT Shieldを介してMEGA2560に接続されているLEDモジュールをオン/オフにできる。

|       |                           Web                           |                   Smart Home                    |
|-------|:-------------------------------------------------------:|:-----------------------------------------------:|
| Red   |   ![web_rgb_red.png](assets/lesson05/web_rgb_red.png)   |   ![rgb_red.png](assets/lesson05/rgb_red.png)   |
| Green | ![web_rgb_green.png](assets/lesson05/web_rgb_green.png) | ![rgb_green.png](assets/lesson05/rgb_green.png) |
| Blue  |  ![web_rgb_blue.png](assets/lesson05/web_rgb_blue.png)  |  ![rgb_blue.png](assets/lesson05/rgb_blue.png)  |
