package com.dugaroverseas.features.dashboard.presentation.api.dayStartEnd

import com.dugaroverseas.features.stockCompetetorStock.api.AddCompStockApi
import com.dugaroverseas.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}