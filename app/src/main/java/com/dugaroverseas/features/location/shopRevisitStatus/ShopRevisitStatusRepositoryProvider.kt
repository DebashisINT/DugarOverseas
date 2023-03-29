package com.dugaroverseas.features.location.shopRevisitStatus

import com.dugaroverseas.features.location.shopdurationapi.ShopDurationApi
import com.dugaroverseas.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}