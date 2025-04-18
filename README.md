# WeatherApp

## Overview
WeatherApp is a real-time weather forecasting application built using Jetpack Compose. It allows users to search for any location and view detailed weather information, including temperature, humidity, wind speed, precipitation, UV index, and more. This project demonstrates modern Android development practices, such as declarative UI, LiveData, and API integration.

---

## APK Link
"https://drive.google.com/drive/folders/1tWemmLx1mSj1utnVeM08zlLisHHdxRY0?usp=sharing"

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


---

## Usage

1. Open the app.
2. Login or Sign Up.
3. Enter a city name in the search bar and press the search button.
4. View the weather details for the entered city.
5. Default weather details for Indore will load if no search is performed.
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





