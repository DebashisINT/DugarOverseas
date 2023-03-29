package com.dugaroverseas.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.dugaroverseas.app.FileUtils
import com.dugaroverseas.base.BaseResponse
import com.dugaroverseas.features.NewQuotation.model.*
import com.dugaroverseas.features.addshop.model.AddShopRequestData
import com.dugaroverseas.features.addshop.model.AddShopResponse
import com.dugaroverseas.features.damageProduct.model.DamageProductResponseModel
import com.dugaroverseas.features.damageProduct.model.delBreakageReq
import com.dugaroverseas.features.damageProduct.model.viewAllBreakageReq
import com.dugaroverseas.features.login.model.userconfig.UserConfigResponseModel
import com.dugaroverseas.features.myjobs.model.WIPImageSubmit
import com.dugaroverseas.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}