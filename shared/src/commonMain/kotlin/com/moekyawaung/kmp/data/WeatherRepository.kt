package com.moekyawaung.kmp.data

import com.moekyawaung.kmp.domain.Weather
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    fun getWeather(city: String): Flow<Weather>
}

class WeatherRepositoryImpl : WeatherRepository {
    override fun getWeather(city: String): Flow<Weather> {
        // Real implementation with Ktor + caching
        TODO("Senior implementation coming in next commit")
    }

}
