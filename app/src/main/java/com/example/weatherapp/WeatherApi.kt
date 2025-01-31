package com.example.weatherapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("weather")
    suspend fun getWeather(
        @Query("q") city: String,
        @Query("appid") apiKey: String,
        @Query("units") units: String = "metric",
    ): WeatherResponse

    companion object {
        private const val BaseUrl = "https://api.openweathermap.org/data/2.5/"
        fun create(): WeatherApi {
            val retroFit = Retrofit.Builder()
                .addConverterFactory(
                    GsonConverterFactory.create()
                ).baseUrl(BaseUrl)
                .build()
            return retroFit.create(WeatherApi::class.java)
        }
    }
}
//0eb27a1190f1a44ec53007efcf59e8b6
//https://api.openweathermap.org/data/2.5/weather?q=cairo&appid=0eb27a1190f1a44ec53007efcf59e8b6https://api.openweathermap.org/data/2.5/weather?q=cairo&appid=0eb27a1190f1a44ec53007efcf59e8b6