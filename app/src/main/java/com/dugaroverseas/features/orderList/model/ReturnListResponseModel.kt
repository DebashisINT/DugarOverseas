package com.dugaroverseas.features.orderList.model

import com.dugaroverseas.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}