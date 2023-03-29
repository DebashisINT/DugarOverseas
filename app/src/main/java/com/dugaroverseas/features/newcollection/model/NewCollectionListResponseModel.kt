package com.dugaroverseas.features.newcollection.model

import com.dugaroverseas.app.domain.CollectionDetailsEntity
import com.dugaroverseas.base.BaseResponse
import com.dugaroverseas.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}