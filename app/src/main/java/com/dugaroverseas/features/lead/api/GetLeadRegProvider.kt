package com.dugaroverseas.features.lead.api

import com.dugaroverseas.features.NewQuotation.api.GetQuotListRegRepository
import com.dugaroverseas.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}