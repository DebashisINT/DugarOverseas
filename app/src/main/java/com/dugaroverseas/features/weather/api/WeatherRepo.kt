package com.dugaroverseas.features.weather.api

import com.dugaroverseas.base.BaseResponse
import com.dugaroverseas.features.task.api.TaskApi
import com.dugaroverseas.features.task.model.AddTaskInputModel
import com.dugaroverseas.features.weather.model.ForeCastAPIResponse
import com.dugaroverseas.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}