# Arduino Development Tips

## 1. WiFiライブラリの管理 (Library Managerの利用)

ZIPファイルを直接ダウンロードするのではなく、Arduino IDE内蔵のライブラリ管理機能を用いてバージョンを管理する。

1. 「Arduino IDE → Sketch → Include Library → Manage Libraries 」
2. 検索窓に「WiFiEsp」を入力する。
3. リストから適切なバージョンを選択し、「インストール」をクリックする。

- 利点: プロジェクトの依存関係管理が容易であり、IDEを通じて手軽に更新が可能である。


## 2. WiFi認証情報のセキュリティ管理 (Configファイルの分離)

ソースコードに直接SSIDやパスワードを記述すると、GitHub上で意図せず公開される危険がある。  
認証情報をプロジェクト横断で一元管理するため、独自のライブラリとして定義・登録する方法を推奨する。

- 手順1: `library/my_secrets/src/` というディレクトリ構成を作成し、その中に `arduino_secrets.h` を新規作成する。  
  ```cpp
  #define SECRET_SSID "******"
  #define SECRET_PASS "******"
  ```
- 手順2: `my_secrets` フォルダ直下に以下の内容で `library.properties` を作成する。
  ```
  name=my_secrets
  version=1.0.0
  author=<author>
  maintainer=<maintainer>
  sentence=Secret credentials
  paragraph=Local secret management
  category=Other
  url=http://arduino.cc
  architectures=*
  ```
- 手順3: `my_secrets` フォルダをZIP形式で圧縮する。
- 手順4: 「Arduino IDE → Sketch → Include Library → Add .Zip library」から作成した `my_secrets.zip`をインポートする。  
- 手順5: メインのスケッチファイルで当該ヘッダーファイルをインクルードし、定義した変数を呼び出す。  
  ```cpp
  #include <arduino_secrets.h>
  
  char ssid[] = SECRET_SSID;
  char pass[] = SECRET_PASS;
  ```
- 手順4: .gitignore に対象ファイルを追加し、GitHubリポジトリへプッシュされないよう設定する。
  ```cpp
  arduino_secrets.h
  ```


## 3. ローカルドメインの活用 (hostsファイルの編集)

IPアドレスの代わりに、覚えやすいローカルドメインを使用してデバイスへアクセスする。

- 手順1: ターミナルを開く。
- 手順2: hostsファイルを編集モードで開く 以下のコマンドを実行する。
  ```bash
  sudo nano /etc/hosts
  ```
- 手順3: ファイルの末尾に、以下の形式でIPアドレスと任意のドメイン名を記述する。
  ```bash
  192.168.0.XX  my-iot.local
  ```
- 手順4: 保存してファイルを閉じる。
- 手順5: ブラウザのアドレスバーに `http://my-iot.local` と入力してアクセスする。


## 4. IoT Shield ピンラベルの解釈 (GND, 5V, SIG)

IoT Shield上の3ピンラベルは以下の通りであり、VCC-GND-S規格と同一。

- **GND (Ground):** 電気回路の共通出口（0V）。
- **5V (VCC):** 部品動作のための電源供給（5V）。
- **SIG (Signal):** 部品からの信号出力や、部品への制御信号入力に使用されるピン。

> **注意:** 接続前に必ず部品の動作電圧（3.3Vまたは5V）を確認すること。
