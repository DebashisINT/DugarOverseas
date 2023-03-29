package com.dugaroverseas.features.viewAllOrder.interf

import com.dugaroverseas.app.domain.NewOrderGenderEntity
import com.dugaroverseas.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}