package com.example.weatherapp

data class WeatherResponse(
    val name: String,
    val main: Main,
    val weather: List<Weather>,
    val sys: Sys,
)

data class Main(
    val temp: Double,
    val humidity: Int,
)

data class Weather(
    val description: String,
)

data class Sys(
    val country: String,
)