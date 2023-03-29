package com.dugaroverseas.features.stockCompetetorStock.api

import com.dugaroverseas.base.BaseResponse
import com.dugaroverseas.features.orderList.model.NewOrderListResponseModel
import com.dugaroverseas.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.dugaroverseas.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}