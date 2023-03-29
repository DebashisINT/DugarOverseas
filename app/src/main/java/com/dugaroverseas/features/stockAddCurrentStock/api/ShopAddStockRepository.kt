package com.dugaroverseas.features.stockAddCurrentStock.api

import com.dugaroverseas.base.BaseResponse
import com.dugaroverseas.features.location.model.ShopRevisitStatusRequest
import com.dugaroverseas.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.dugaroverseas.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.dugaroverseas.features.stockAddCurrentStock.model.CurrentStockGetData
import com.dugaroverseas.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}