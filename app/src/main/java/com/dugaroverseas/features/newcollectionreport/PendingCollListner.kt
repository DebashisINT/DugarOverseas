package com.dugaroverseas.features.newcollectionreport

import com.dugaroverseas.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}