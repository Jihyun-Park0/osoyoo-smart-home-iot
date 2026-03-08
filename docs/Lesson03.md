## Lesson 3: Hello World

### 1. 目的 (Objective)

IoTにおいて、HTTPやMQTTプロトコルは最も一般的な通信プロトコル。  
このレッスンでは、OSOYOO MEGA-IoTシールドとOSOYOO MEGA2560ボードを使用して、簡単なHTTP
Webサーバーを作成する。  
このWebサーバーにより、ブラウザからWebページを開き、現在の状況を確認できる。

### 2. 必要部品とデバイス

- OSOYOO MEGA2560ボード ×1
- OSOYOO MEGA-IoT 拡張ボード ×1
- USB ケーブル ×1
- オス－オス ジャンパーワイヤ ×1

### 3. 作り方 (How to Make)

1. OSOYOO MEGA2560ボードの上にOSOYOO MEGA-IoT拡張ボードを差し込む。
2. オス－オス ジャンパーワイヤを使用して、A0ピンを5Vピンに接続する。  
   （ジャンパーキャップは、ESP8266のRXとA8、TXとA9を接続するようにする）

### 4. コーディング (How to Code)

#### 1. ソフトウェアのインストール（Software Installation）

| Software                           | URL                                                |
|:-----------------------------------|:---------------------------------------------------|
| Open-source Arduino Software (IDE) | https://www.arduino.cc/en/Main/Software?setlang=en |
| 7-zip                              | https://www.7-zip.org/                             |

- Step 1: 最新のArduino IDEをインストール。（すでにバージョン1.1.16以降の場合、このステップはスキップ）
- Step 2: OSOYOO MEGA-IoT拡張ボードのTX/RXピンは、デフォルトでArduinoのA9/A8ピンに接続されている。  
  そのため、Arduinoのスケッチコード内では、Software Serial Portを使用してESP8266と通信が必要。  
 （Software SerialオブジェクトでA8をRX、A9をTXに設定）  
  まず、以下のリンクから WiFiEsp-master ライブラリをダウンロード。
  http://osoyoo.com/driver/WiFiEsp-master.zip
- Step 3: 「Arduino IDE → Sketch → Include Library → Add .Zip library」から上記ファイルを読み込む。
- Step 4: 上記の操作が完了したら、以下のリンクからメインコードをダウンロードし、ZIPファイルを解凍する。  
  http://osoyoo.com/driver/smarthome/smarthome-lesson3.zip
- Step 5: 上記の操作が完了したら、USBケーブルでOSOYOO MEGA2560ボードをPCに接続する。
- Step 6: Arduino IDEを開き、プロジェクトに適したボードタイプとポートタイプを選択する。
- Step 7: Arduino IDE: 「File → Open → "smarthome-lesson3"」を選択して、Arduinoにスケッチをアップロードする。
  - 注意: スケッチ内の以下の行を見つけて、WiFiのSSIDとパスワードを自分のネットワークに合わせて変更する。  
  ```cpp
  char ssid[] = "****"; // WiFiのSSIDを入力
  char pass[] = "****"; // WiFiのパスワードを入力
  ```

### 5. 実行方法 (How to Play)

スケッチをArduinoに読み込んだ後、Arduino IDEの右上にあるシリアルモニタを開くと、以下の結果が表示さる。  

- シリアルモニタから、MEGA2560ボードのIPアドレスを確認できる。

次に、ブラウザを使用してウェブサイトにアクセスすると、以下の結果が表示されます。

- `analogRead()` は0～5Vの入力を読み取り、0～1023の値を返す。  
  今回はA0を5Vに接続しているため、Analog input A0には `1023` と表示される。

![hello_world.png](/docs/assets/lesson03/hello_world.png)
