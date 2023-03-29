package com.dugaroverseas.features.weather.api

import com.dugaroverseas.features.task.api.TaskApi
import com.dugaroverseas.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}