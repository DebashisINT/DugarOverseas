package com.dugaroverseas.features.survey.api

import com.dugaroverseas.features.photoReg.api.GetUserListPhotoRegApi
import com.dugaroverseas.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}