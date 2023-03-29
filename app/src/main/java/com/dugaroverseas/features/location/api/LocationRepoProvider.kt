package com.dugaroverseas.features.location.api

import com.dugaroverseas.features.location.shopdurationapi.ShopDurationApi
import com.dugaroverseas.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}