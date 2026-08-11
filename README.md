# OSOYOO Smart Home IoT Project 🏠

[![Language: EN](https://img.shields.io/badge/Language-English-red.svg)](./README.md)
[![Language: KO](https://img.shields.io/badge/Language-한국어-lightgrey.svg)](./README.ko.md)
[![Language: JA](https://img.shields.io/badge/Language-日本語-lightgrey.svg)](./README.ja.md)

## 📌 Project Overview

This project is a comprehensive **Smart Home Ecosystem** centered around the [OSOYOO Smart Home IoT Kit](https://osoyoo.com/2019/10/18/osoyoo-smart-home-iot-learning-kit-with-mega2560-introduction/). It features a cross-platform dashboard that enables real-time monitoring and control of hardware sensors and actuators across multiple platforms.

## 🚀 Key Objectives

- **Cross-Platform Control:** Unified dashboard for Android, iOS, Desktop, and Web using Compose Multiplatform.
- **Hardware-Software Synergy:** Seamless integration between Arduino-based firmware and modern client applications.
- **Engineering Excellence:** Focusing on clean, modular architecture across C++ and Kotlin codebases.

## 🛠️ Tech Stack

- **Hardware:** Arduino Mega 2560, OSOYOO Smart Home Kit
- **Firmware:** C++ (Arduino Sketch)
- **Client (Dashboard):** Kotlin Multiplatform (Compose Multiplatform)
    - **Platforms:** Android, iOS, Desktop (JVM), Web (Wasm)
- **VCS:** Git / GitHub (Gitmoji convention)

## 📂 Structure

```
osoyoo-smart-home-iot/
├── firmware/          # [Embedded] Arduino source and libraries
│   ├── sample/        # Sample code for each lesson (.ino)
│   ├── src/           # Practice and refactored code
│   └── library/       # Project required libraries
├── client/            # [Mobile/Desktop/Web] Compose Multiplatform Dashboard
│   ├── androidApp/    # Android specific implementation
│   ├── iosApp/        # iOS specific implementation
│   ├── desktopApp/    # Desktop (JVM) specific implementation
│   ├── webApp/        # Web (Wasm) specific implementation
│   └── shared/        # Shared business logic and UI components
└── docs/              # GCircuit diagrams, sensor specifications, and visual evidence.
```

> [!TIP]
> For more details on the Dashboard application, check the **[Client README](./client/README.md)**.

## 📖 Roadmap & Progress

The initial IoT learning phase is completed. For the detailed curriculum roadmap and lesson-by-lesson progress, please refer to:
👉 **[IoT Learning Journey Curriculum (CURRICULUM.md)](./docs/CURRICULUM.md)**

### Current Focus: Phase 2 - Smart Home Dashboard 🚀
Building a cross-platform client to interact with the hardware. Track our development progress on GitHub:
👉 **[Smart Home Dashboard Project](https://github.com/users/Jihyun-Park0/projects/2)**
