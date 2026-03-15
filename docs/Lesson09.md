## Lesson 9: ガス検知 (Gas Detection)

### 1. 目的 (Objective)

このレッスンでは、インターネットを利用してリモートの煙センサーの状態を監視する方法を紹介する。
Arduino MEGA2560ボードはWebサーバーとして機能し、リモートブラウザはこのウェブサーバーにアクセスし、火災センサーのリアルタイムの状態を表示できる。

### 2. 必要部品とデバイス

- OSOYOO MEGA2560ボード ×1
- OSOYOO MEGA-IoT 拡張ボード ×1
- USB ケーブル ×1
- 赤色LED PnPモジュール ×1
- 緑色LED PnPモジュール ×1
- ガスセンサー PnPモジュール ×1
- 3ピン PnP ケーブル ×1

### 3. 作り方 (How to Make)

1. OSOYOO MEGA2560ボードの上にOSOYOO MEGA-IoT拡張ボードを差し込む。  
    （ジャンパーキャップは、ESP8266のRXとA8、TXとA9を接続するようにする）
2. 緑色LEDモジュール -- D12
   赤色LEDモジュール -- D11 (※D13にした)
   ガス検知モジュール -- A3  
   （ガス検知モジュールのスイッチが左側の「D」（「A」ではない）に設定されていることを確認する）
   

### 4. コーディング (How to Code)

- Step 1: 最新のArduino IDEをインストール。（スキップ）
- Step 2: WiFiEsp-master ライブラリインストール。（スキップ）  
- Step 3: 以下のリンクからメインコードをダウンロードし、ZIPファイルを解凍する。（スキップ）
  http://osoyoo.com/driver/smarthome/smarthome-lesson9.zip
- Step 4: OSOYOO MEGA2560ボードをUSBケーブルでPCに接続する。  
- Step 5: Arduino IDEを開き、プロジェクトに適したボードタイプとポートタイプを選択する。
- Step 6: Arduino IDE: 「File → Open → "smarthome-lesson9"」を選択して、Arduinoにスケッチをアップロードする。
  - 注意: スケッチ内の以下の行を見つけて、WiFiのSSIDとパスワードを自分のネットワークに合わせて変更する。  
  ```cpp
  char ssid[] = "****"; // WiFiのSSIDを入力
  char pass[] = "****"; // WiFiのパスワードを入力
  ```

### 5. 実行方法 (How to Play)

スケッチをArduinoに読み込んだ後、Arduino IDEの右上にあるシリアルモニタを開くと、以下の結果が表示さる。  

- シリアルモニタから、MEGA2560ボードのIPアドレスを確認できる。

ブラウザを使用してウェブサイトにアクセスすると、
煙の信号が検出されていない場合、MEGA-IoTシールドのD13ピンにある赤色LEDは消灯し、緑色LEDが点灯する。
次に、ガスライターを使用してセンサーにガスを吹きかけて、ガスがArduinoに火災信号を送る。
IoTシールドの緑色LEDが消灯し、赤色LEDが点灯するのが確認できる。

|      |                      Web                      |              Smart Home              |
|------|:---------------------------------------------:|:------------------------------------:|
| Fire | ![web_fire.png](assets/lesson09/web_fire.png) | [fire.mp4](assets/lesson09/fire.mp4) |
| Safe | ![web_safe.png](assets/lesson09/web_safe.png) | [safe.mp4](assets/lesson09/safe.mp4) |
