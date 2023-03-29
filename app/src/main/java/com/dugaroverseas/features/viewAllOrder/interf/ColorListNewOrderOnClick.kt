package com.dugaroverseas.features.viewAllOrder.interf

import com.dugaroverseas.app.domain.NewOrderColorEntity
import com.dugaroverseas.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}