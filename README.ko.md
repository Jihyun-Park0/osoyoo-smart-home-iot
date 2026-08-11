# OSOYOO 스마트 홈 IoT 프로젝트 🏠

[![Language: EN](https://img.shields.io/badge/Language-English-lightgrey.svg)](./README.md)
[![Language: KO](https://img.shields.io/badge/Language-한국어-blue.svg)](./README.ko.md)
[![Language: JA](https://img.shields.io/badge/Language-日本語-lightgrey.svg)](./README.ja.md)

## 📌 프로젝트 개요

이 프로젝트는 [OSOYOO 스마트 홈 IoT 키트](https://osoyoo.com/2019/10/18/osoyoo-smart-home-iot-learning-kit-with-mega2560-introduction/)를 중심으로 한 통합 **스마트 홈 생태계**입니다. 멀티플랫폼 대시보드를 통해 하드웨어 센서와 액추에이터를 실시간으로 모니터링하고 제어합니다.

## 🚀 주요 목표

- **멀티플랫폼 통합 제어:** Compose Multiplatform을 활용한 Android, iOS, Desktop, Web 통합 대시보드 구축.
- **하드웨어-소프트웨어 시너지:** 아두이노 기반 펌웨어와 현대적인 클라이언트 앱 간의 매끄러운 연동.
- **엔지니어링 역량 강화:** C++와 Kotlin 코드베이스 전반에 걸친 클린, 모듈화 아키텍처 지향.

## 🛠️ 기술 스택

- **하드웨어:** Arduino Mega 2560, OSOYOO Smart Home Kit
- **펌웨어:** C++ (Arduino Sketch)
- **클라이언트 (대시보드):** Kotlin Multiplatform (Compose Multiplatform)
    - **플랫폼:** Android, iOS, Desktop (JVM), Web (Wasm)
- **버전 관리:** Git / GitHub (Gitmoji 컨벤션 준수)

## 📂 폴더 구조

```
osoyoo-smart-home-iot/
├── firmware/          # [Embedded] 아두이노 소스 및 라이브러리
│   ├── sample/        # Lesson별 예제 코드 (.ino)
│   ├── src/           # 실습 및 리팩토링 코드
│   └── library/       # 프로젝트 필수 라이브러리
├── client/            # [Mobile/Desktop/Web] Compose Multiplatform 대시보드
│   ├── androidApp/    # Android 앱 구현
│   ├── iosApp/        # iOS 앱 구현
│   ├── desktopApp/    # Desktop (JVM) 앱 구현
│   ├── webApp/        # Web (Wasm) 앱 구현
│   └── shared/        # 공통 비즈니스 로직 및 UI 컴포넌트
└── docs/              # 회로도, 센서 사양서 및 실제 동작 증거 자료.
```

> [!TIP]
> 대시보드 애플리케이션에 대한 자세한 내용은 **[클라이언트 README](./client/README.ko.md)**를 참조하세요.

## 📖 로드맵 및 진행 상황

초기 IoT 학습 단계가 완료되었습니다. 상세한 커리큘럼 로드맵과 레슨별 진행 상황은 다음 문서를 참조하세요:
👉 **[IoT 학습 여정 커리큘럼 (CURRICULUM.ko.md)](./docs/CURRICULUM.ko.md)**

### 현재 집중 과제: Phase 2 - 스마트 홈 대시보드 🚀
하드웨어와 연동되는 멀티플랫폼 클라이언트를 구축 중입니다. 개발 진행 상황은 GitHub Project에서 확인하실 수 있습니다:
👉 **[스마트 홈 대시보드 프로젝트](https://github.com/users/Jihyun-Park0/projects/2)**
