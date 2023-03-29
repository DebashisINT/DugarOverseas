package com.dugaroverseas.features.nearbyuserlist.api

import com.dugaroverseas.app.Pref
import com.dugaroverseas.features.nearbyuserlist.model.NearbyUserResponseModel
import com.dugaroverseas.features.newcollection.model.NewCollectionListResponseModel
import com.dugaroverseas.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}