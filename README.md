# WeatherApp

## Overview
WeatherApp is a real-time weather forecasting application built using Jetpack Compose. It allows users to search for any location and view detailed weather information, including temperature, humidity, wind speed, precipitation, UV index, and more. This project demonstrates modern Android development practices, such as declarative UI, LiveData, and API integration.

---

## APK Link
"https://drive.google.com/file/d/1033IxrXUNDj2vp2HeydOs3s3qNJ09qC8/view?usp=sharing"

## Features
1. **Search Functionality**:
   - Users can input any city name to fetch its weather details.
   - Utilizes an `OutlinedTextField` for user input.

2. **Real-Time Weather Data**:
   - Fetches live weather data using a weather API.
   - Displays information such as temperature, weather condition, humidity, wind speed, and more.

3. **Dynamic UI**:
   - The app uses Jetpack Compose to create a responsive and aesthetically pleasing user interface.
   - Icons, cards, and progress indicators enhance the user experience.

4. **Error Handling**:
   - Properly handles API errors and displays user-friendly messages.

5. **Default Location**:
   - Displays weather details for a default location (e.g., Indore) on the home page.

---

## Technology Stack
- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM (Model-View-ViewModel)
- **API Integration**: Retrofit
- **Image Loading**: Coil
- **State Management**: LiveData

---

## Code Structure
### Key Components

1. **WeatherPage**
   - Main composable function that displays the search bar, fetches weather data, and handles different API states (loading, success, error).

2. **WeatherDetails**
   - Displays detailed weather information such as temperature, condition, and additional metrics (humidity, wind speed, etc.).

3. **WeatherKeyVal**
   - A reusable composable function for displaying key-value pairs (e.g., "Humidity: 60").

4. **ViewModel**
   - `WeatherViewModel` handles data fetching and exposes the results to the UI via LiveData.

5. **API Response Handling**
   - Utilizes a sealed class `NetworkResponse` to manage different states: `Loading`, `Success`, and `Error`.

---

## Dependencies
Include the following dependencies in your `build.gradle` file:

```gradle
implementation "androidx.compose.material3:material3:1.5.2"
implementation "androidx.compose.runtime:runtime-livedata:1.5.2"
implementation "io.coil-kt:coil-compose:2.0.0"
implementation "androidx.lifecycle:lifecycle-livedata-ktx:2.6.1"
```

---

## Installation and Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/your-repository/weatherapp.git
   ```

2. Open the project in Android Studio.

3. Add your API key for the weather service in the `WeatherViewModel` (if required).

4. Sync the Gradle files.

5. Run the application on an emulator or physical device.

---

## Usage

1. Open the app.
2. Enter a city name in the search bar and press the search button.
3. View the weather details for the entered city.
4. Default weather details for Indore will load if no search is performed.

---

## API Integration
### Example API Response Structure
```json
{
  "location": {
    "name": "Indore",
    "country": "India",
    "localtime": "2024-12-22 14:00"
  },
  "current": {
    "temp_c": 25.0,
    "condition": {
      "text": "Sunny",
      "icon": "//cdn.weatherapi.com/weather/64x64/day/113.png"
    },
    "humidity": 60,
    "wind_kph": 15.0,
    "uv": 5.0,
    "precip_mm": 0.0
  }
}
```

---

## Known Issues and Improvements
1. **Error Handling**:
   - Enhance error messages for specific API failures.

2. **Loading State**:
   - Add more engaging loading animations.

3. **Unit Tests**:
   - Add unit tests for ViewModel and composable functions.

4. **Dark Mode**:
   - Implement dark mode support for better usability.

---




