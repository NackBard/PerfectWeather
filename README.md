# 🌤️ PerfectWeather

An Android weather application built with **Kotlin**, featuring a clean bottom navigation UI and a modular fragment-based architecture.

## 📱 Screenshots

> _Add screenshots of the app here_

## ✨ Features

- **Today's Weather** — dedicated screen for current weather conditions
- **City Search** — browse and search weather by city
- **Bottom Navigation** — smooth tab-based navigation between screens
- **Internet & Location permissions** — ready for real-time weather data integration

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Kotlin |
| UI | Android Views, ConstraintLayout, Material Design |
| Navigation | Fragment Manager + Bottom Navigation |
| Networking | Retrofit 2 + Gson |
| Build | Gradle |
| Min SDK | API 16 (Android 4.1+) |
| Target SDK | API 30 (Android 11) |

## 🏗️ Architecture

The project follows a **Fragment-based** architecture with clear separation of screens:

```
app/
└── src/main/
    ├── java/com/example/perfectweather/
    │   ├── MainActivity.kt          # Entry point, navigation host
    │   └── fragment/
    │       ├── TodayFragment.kt     # Current weather screen
    │       └── CitiesFragment.kt    # City search screen
    └── res/
        ├── layout/                  # XML layouts
        ├── menu/                    # Bottom navigation menu
        └── values/                  # Colors, strings, styles
```

## 🚀 Getting Started

### Prerequisites

- Android Studio Arctic Fox or newer
- JDK 8+
- Android SDK (API 30)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/NackBard/PerfectWeather.git
   ```

2. Open the project in Android Studio.

3. Add your weather API key (e.g. from [OpenWeatherMap](https://openweathermap.org/api)):
   ```kotlin
   // In your network layer
   const val API_KEY = "your_api_key_here"
   ```

4. Build and run on an emulator or physical device.

## 🔮 Roadmap

- [ ] Integrate OpenWeatherMap API for live weather data
- [ ] Display temperature, humidity, wind speed
- [ ] GPS-based automatic location detection
- [ ] 7-day weather forecast screen
- [ ] Dark mode support
- [ ] Offline caching with Room database

## 📦 Dependencies

```gradle
// Networking
implementation 'com.squareup.retrofit2:retrofit:2.5.0'
implementation 'com.squareup.retrofit2:converter-gson:2.3.0'
implementation 'com.google.code.gson:gson:2.8.5'

// UI
implementation 'com.google.android.material:material:1.2.1'
implementation 'androidx.constraintlayout:constraintlayout:2.0.4'
implementation 'androidx.navigation:navigation-fragment-ktx:2.3.0'
```

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

> Built with ❤️ using Kotlin and Android SDK
