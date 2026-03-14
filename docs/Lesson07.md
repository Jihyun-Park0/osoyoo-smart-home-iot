## Lesson 7: DHT11 温湿度センサー (DHT11 Sensor)

### 1. 目的 (Objective)

このレッスンでは、DHT11のデータをリモートで取得する方法を紹介する。
この例ではArduinoからリモートブラウザへどのように値を送信できるかを示す。
Osoyoo Mega-IoTシールドを使用して、DHT11センサーとMEGA2560 MCUボードを接続する。
Arduino MEGA2560ボードはWebサーバーとして機能し、リモートブラウザはこのウェブサーバーにアクセスし、MEGA2560のD2ピンに接続されたDHT11のデータを取得できる。

### 2. 必要部品とデバイス

- OSOYOO MEGA2560ボード ×1
- OSOYOO MEGA-IoT 拡張ボード ×1
- USB ケーブル ×1
- DHT11 PnPモジュール ×1
- 3ピン PnP ケーブル ×1

### 3. 作り方 (How to Make)

1. OSOYOO MEGA2560ボードの上にOSOYOO MEGA-IoT拡張ボードを差し込む。
2. 3ピンPnPケーブルを使用して、DH11温度湿度センサーをOSOYOO MEGA-IoT拡張ボードのD2ポートに接続する。  
   （ジャンパーキャップは、ESP8266のRXとA8、TXとA9を接続するようにする）

### 4. コーディング (How to Code)

- Step 1: 最新のArduino IDEをインストール。（スキップ）
- Step 2: WiFiEsp-master ライブラリインストール。（スキップ）  
  DHT11センサーを使用するには、上記と同じ手順でDHT11ライブラリをインストール。
- Step 3: 以下のリンクからメインコードをダウンロードし、ZIPファイルを解凍する。（スキップ）
  http://osoyoo.com/driver/smarthome/7/smarthome_lesson7.zip
- Step 4: OSOYOO MEGA2560ボードをUSBケーブルでPCに接続する。  
- Step 5: Arduino IDEを開き、プロジェクトに適したボードタイプとポートタイプを選択する。
- Step 6: Arduino IDE: 「File → Open → "smarthome-lesson7"」を選択して、Arduinoにスケッチをアップロードする。
  - 注意: スケッチ内の以下の行を見つけて、WiFiのSSIDとパスワードを自分のネットワークに合わせて変更する。  
  ```cpp
  char ssid[] = "****"; // WiFiのSSIDを入力
  char pass[] = "****"; // WiFiのパスワードを入力
  ```

### 5. 実行方法 (How to Play)

スケッチをArduinoに読み込んだ後、Arduino IDEの右上にあるシリアルモニタを開くと、以下の結果が表示さる。  

- シリアルモニタから、MEGA2560ボードのIPアドレスを確認できる。

次に、ブラウザを使用してウェブサイトにアクセスすると、DHT11センサーの温湿度データが表示される。
ウェブページは20秒ごとに自動的に更新され、1分ほど待つと、ウェブページに以下のようなデータが表示される。

![web_dht11.png](assets/lesson07/web_dht11.png)
