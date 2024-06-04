package com.riwi.surveys.infrastructure.helpers.mappers;

import org.springframework.stereotype.Component;

import com.riwi.surveys.api.dto.request.QuestionRequest;
import com.riwi.surveys.api.dto.response.QuestionResponse;
import com.riwi.surveys.domain.entities.QuestionEntity;
import com.riwi.surveys.infrastructure.helpers.abstract_mappers.IQuestionMapper;

@Component
public class QuestionMapper implements IQuestionMapper{
    @Override
    public QuestionEntity requestToEntity(QuestionRequest request) {
        return QuestionEntity.builder()
                .text(request.getText())
                .type(request.getType())
                .surveyId(request.getSurveyId())
                .active(request.getActive())
                .build();
    }

    @Override
    public QuestionResponse entityToResponse(QuestionEntity entity) {
        return QuestionResponse.builder()
                .id(entity.getId())
                .text(entity.getText())
                .type(entity.getType())
                .surveyId(entity.getSurveyId())
                .active(entity.getActive())
                .build();
    }
}
