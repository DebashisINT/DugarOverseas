package com.dugaroverseas.features.photoReg.present

import com.dugaroverseas.app.domain.ProspectEntity
import com.dugaroverseas.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}