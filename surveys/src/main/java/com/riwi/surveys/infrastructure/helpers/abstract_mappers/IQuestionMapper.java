package com.riwi.surveys.infrastructure.helpers.abstract_mappers;

import com.riwi.surveys.api.dto.request.QuestionRequest;
import com.riwi.surveys.api.dto.response.QuestionResponse;
import com.riwi.surveys.domain.entities.QuestionEntity;

public interface IQuestionMapper extends MapperBase<QuestionRequest, QuestionEntity, QuestionResponse>{
    
}
