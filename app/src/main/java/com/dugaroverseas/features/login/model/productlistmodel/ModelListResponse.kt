package com.dugaroverseas.features.login.model.productlistmodel

import com.dugaroverseas.app.domain.ModelEntity
import com.dugaroverseas.app.domain.ProductListEntity
import com.dugaroverseas.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}