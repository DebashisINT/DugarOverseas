package com.dugaroverseas.features.viewAllOrder.orderOptimized

import com.dugaroverseas.app.domain.ProductOnlineRateTempEntity
import com.dugaroverseas.base.BaseResponse
import com.dugaroverseas.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}