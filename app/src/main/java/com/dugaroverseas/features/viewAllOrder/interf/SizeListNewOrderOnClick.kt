package com.dugaroverseas.features.viewAllOrder.interf

import com.dugaroverseas.app.domain.NewOrderProductEntity
import com.dugaroverseas.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}