# OSOYOO 스마트 홈 IoT 프로젝트 🏠

[![Language: EN](https://img.shields.io/badge/Language-English-lightgrey.svg)](./README.md)
[![Language: KO](https://img.shields.io/badge/Language-한국어-blue.svg)](./README.ko.md)
[![Language: JA](https://img.shields.io/badge/Language-日本語-lightgrey.svg)](./README.ja.md)

## 📌 프로젝트 개요

이 프로젝트는 [OSOYOO 스마트 홈 IoT 학습 키트](https://osoyoo.com/2019/10/18/osoyoo-smart-home-iot-learning-kit-with-mega2560-introduction/)를 활용하여 IoT 시스템 전반을 마스터하는 과정을 기록합니다. 단순한 코드 복사를 넘어, 센서 메커니즘의 이해부터 스마트 홈 자동화 구현까지의 깊이 있는 학습을 목표로 합니다.

## 🚀 주요 학습 목표

- **IoT 핵심 기술 습득:** 다양한 센서의 데이터 수집 원리와 액추에이터 제어 로직을 심도 있게 학습합니다.
- **스마트 홈 자동화 구현:** 화재 감지, 보안 알람, 환경 제어 등 실제 생활에 적용 가능한 자동화 시나리오를 구축합니다.
- **엔지니어링 역량 강화:** 하드웨어 스케치를 모듈화된 소프트웨어 구조로 고도화하고 체계적인 기술 문서화를 실천합니다.

## 🛠️ 기술 스택

- **하드웨어:** Arduino Mega 2560, OSOYOO Smart Home Kit
- **언어:** C++ (Arduino Sketch)
- **버전 관리:** Git / GitHub (Gitmoji 컨벤션 준수)

## 📂 폴더 구조

```
osoyoo-smart-home-iot/
├── firmware/          # [Embedded] 아두이노 소스 및 라이브러리
│   ├── sample/        # Lesson별 예제 코드 (.ino)
│   └── src/           # 실습 및 리팩토링 코드
│   └── library/       # 프로젝트 필수 라이브러리
└── docs/              # 회로도, 센서 사양서 및 실제 동작 증거 자료.
```

## 📖 로드맵

[OSOYOO 공식 튜토리얼](https://osoyoo.com/2019/10/18/osoyoo-smart-home-iot-learning-kit-with-mega2560-introduction/)의 과정을 따라 IoT 시스템을 단계별로 학습합니다:

1. **[Step 1] 기초 및 조립:** IoT 개념 이해 및 하드웨어 모델 조립 (Lesson 1-2)
2. **[Step 2] 기본 입출력 제어:** LED, 부저, 온습도 센서 등 기초 모듈 제어 (Lesson 3-7)
3. **[Step 3] 고급 센서 및 장치 활용:** 서보 모터, 가스/불꽃/소리/광센서 및 LCD 출력 (Lesson 8-14)
4. **[Step 4] 시스템 심화 및 통합:** 릴레이 제어, RFID 보안 및 최종 통합 프로젝트 완성 (Lesson 15-19)

### ✅ 레슨 체크리스트

- [x] **Lesson 1:** 사물인터넷 (Internet of Things)
- [x] **Lesson 2:** 모델 조립 (Model Installation)
- [x] **Lesson 3:** 헬로 월드 (Hello World)
- [x] **Lesson 4:** 원격 제어 LED (Remote Control LED)
- [ ] **Lesson 5:** RGB 모듈 (RGB Module)
- [ ] **Lesson 6:** 액티브 부저 (Active Buzzer)
- [ ] **Lesson 7:** DHT11 온습도 센서 (DHT11 Sensor)
- [ ] **Lesson 8:** 문 개폐 제어 (Switching Door)
- [ ] **Lesson 9:** 가스 감지 (Gas Detection)
- [ ] **Lesson 10:** 불꽃 감지 (Flame Detection)
- [ ] **Lesson 11:** 소리 센서 (Sound Sensor)
- [ ] **Lesson 12:** 조도 센서 (Light Sensor)
- [ ] **Lesson 13:** PIR 인체 감지 (PIR Motion Detection)
- [ ] **Lesson 14:** LCD 스크린 (LCD Screen)
- [ ] **Lesson 15:** 1채널 릴레이 (1-Channel Relay)
- [ ] **Lesson 16:** RFID 문 개폐 시스템 (RFID Switching Door)
- [ ] **Lesson 17:** 인간 움직임 추적 (Tracing Human Movement)
- [ ] **Lesson 18:** 두 대의 Mega-IoT 장치 연동 (Two Mega-IoT Devices)
- [ ] **Lesson 19:** IoT 캡스톤 프로젝트 (IoT Capstone Project)
