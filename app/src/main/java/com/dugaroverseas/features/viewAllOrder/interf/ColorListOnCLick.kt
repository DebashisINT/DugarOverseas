package com.dugaroverseas.features.viewAllOrder.interf

import com.dugaroverseas.app.domain.NewOrderGenderEntity
import com.dugaroverseas.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}