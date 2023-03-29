package com.dugaroverseas.features.location.shopRevisitStatus

import com.dugaroverseas.base.BaseResponse
import com.dugaroverseas.features.location.model.ShopDurationRequest
import com.dugaroverseas.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}