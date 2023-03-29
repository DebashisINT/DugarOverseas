package com.dugaroverseas.features.document.api

import com.dugaroverseas.features.dymanicSection.api.DynamicApi
import com.dugaroverseas.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}