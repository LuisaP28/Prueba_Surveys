package com.riwi.surveys.infrastructure.helpers.abstract_mappers;

import com.riwi.surveys.api.dto.request.SurveyRequest;
import com.riwi.surveys.api.dto.response.SurveyResponse;
import com.riwi.surveys.domain.entities.SurveyEntity;

public interface ISurveyMapper extends MapperBase<SurveyRequest, SurveyEntity, SurveyResponse> {
    
}
