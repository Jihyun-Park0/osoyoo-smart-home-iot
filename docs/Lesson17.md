## Lesson 17: 人間の動きの追跡 (Tracing Human Movement)

### 1. 目的 (Objective)

このレッスンでは、人体の動きを検出するためにモーションセンサーを使用する方法と、
リモートのコンピューター（ブラウザ）に侵入者のステータスを報告する方法を紹介する。

### 2. 必要部品とデバイス

- OSOYOO MEGA2560ボード ×1
- OSOYOO MEGA-IoT 拡張ボード ×1
- USB ケーブル ×1
- LED モジュール 赤 x 1, 緑 x 1, 黄 x 1, 白 x 1
- 超音波距離センサー PnP モジュール ×1
- 3ピン PnP ケーブル ×4
- 4ピン PnP ケーブル ×1

### 3. 作り方 (How to Make)

1. OSOYOO MEGA2560ボードの上にOSOYOO MEGA-IoT拡張ボードを差し込む。  
   （ジャンパーキャップは、ESP8266のRXとA8、TXとA9を接続するようにする）
2. 白LEDモジュール -- D9  
   黄LEDモジュール -- D10  
   赤LEDモジュール -- D11  
   緑LEDモジュール -- D12  
   超音波距離センサー -- 超音波スロット (4ピン PnP ケーブル)

### 4. コーディング (How to Code)

- Step 1: 最新のArduino IDEをインストール。（スキップ）
- Step 2: WiFiEsp-master ライブラリインストール。（スキップ）
- Step 3: 以下のリンクからメインコードをダウンロードし、ZIPファイルを解凍する。（スキップ）  
  https://osoyoo.com/driver/smarthome/smarthome-lesson17.zip
- Step 4: OSOYOO MEGA2560ボードをUSBケーブルでPCに接続する。
- Step 5: Arduino IDEを開き、プロジェクトに適したボードタイプとポートタイプを選択する。
- Step 6: Arduino IDE: 「File → Open → "smarthome-lesson17"」を選択して、Arduinoにスケッチをアップロードする。
    - 注意: スケッチ内の以下の行を見つけて、WiFiのSSIDとパスワードを自分のネットワークに合わせて変更する。
  ```cpp
  char ssid[] = "****"; // WiFiのSSIDを入力
  char pass[] = "****"; // WiFiのパスワードを入力
  ```

### 5. 実行方法 (How to Play)

スケッチをArduinoに読み込んだ後、Arduino IDEの右上にあるシリアルモニタを開くと、以下の結果が表示さる。

- シリアルモニタから、MEGA2560ボードのIPアドレスを確認できる。

**実行結果：**  
同時に赤色のLEDが点灯するのが確認できる。
物体を超音波センサーから近い距離の位置へとゆっくり移動させると、LEDは緑、黄、白へと変化する。
ブラウザにも同様の結果が表示される。  
（ただし、ブラウザのステータスは5秒ごとにしか更新されないため、非常に速く移動させることはできない）

|                |                                Web                                |                        Smart Home                         |
|----------------|:-----------------------------------------------------------------:|:---------------------------------------------------------:|
| Human movement | ![web_human_movement.mov](assets/lesson17/web_human_movement.mov) | ![human_movement.mp4](assets/lesson17/human_movement.mp4) |
