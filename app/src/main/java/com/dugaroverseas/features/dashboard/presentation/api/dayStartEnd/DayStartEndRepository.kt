package com.dugaroverseas.features.dashboard.presentation.api.dayStartEnd

import com.dugaroverseas.app.Pref
import com.dugaroverseas.base.BaseResponse
import com.dugaroverseas.features.dashboard.presentation.model.DaystartDayendRequest
import com.dugaroverseas.features.dashboard.presentation.model.StatusDayStartEnd
import com.dugaroverseas.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.dugaroverseas.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }

    fun daystartendDelete(sessionToken:String,usrID:String,date:String,dayStDel:String,dayEndDel:String): Observable<BaseResponse> {
        return apiService.submitDayStartEndDelApi(sessionToken,usrID,date,dayStDel,dayEndDel)
    }


}