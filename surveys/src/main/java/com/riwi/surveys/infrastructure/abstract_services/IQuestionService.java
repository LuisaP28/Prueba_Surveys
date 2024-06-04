package com.riwi.surveys.infrastructure.abstract_services;

import com.riwi.surveys.api.dto.request.QuestionRequest;
import com.riwi.surveys.api.dto.response.QuestionResponse;

public interface IQuestionService extends ServiceBase<QuestionRequest, QuestionResponse, Long> {
    
}
