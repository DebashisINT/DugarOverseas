package com.dugaroverseas.features.stockAddCurrentStock.api

import com.dugaroverseas.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.dugaroverseas.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}