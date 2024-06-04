package com.riwi.surveys.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.riwi.surveys.api.dto.request.QuestionRequest;
import com.riwi.surveys.api.dto.response.QuestionResponse;
import com.riwi.surveys.domain.entities.QuestionEntity;
import com.riwi.surveys.domain.repositories.SurveyRepository;
import com.riwi.surveys.infrastructure.abstract_services.IQuestionService;
import com.riwi.surveys.infrastructure.helpers.ServiceHelper;
import com.riwi.surveys.infrastructure.helpers.abstract_mappers.ISurveyMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class QuestionService implements IQuestionService {
    
    @Autowired
    private final SurveyRepository surveyRepository;

    @Autowired
    private final ServiceHelper serviceHelper;

    @Autowired
    private ISurveyMapper surveyMapper;

    @Override
    public QuestionResponse create(QuestionRequest request) {
        QuestionEntity question = this.questionMapper.requestToEntity(request);
        return this.questionMapper.entityToResponse(this.questionRepository.save(question));
    }

    @Override
    public QuestionResponse get(Long id) {
        QuestionEntity question = this.serviceHelper.find(id, questionRepository, "question");
        return this.questionMapper.entityToResponse(question);
    }

    @Override
    public Page<QuestionResponse> getAll(int page, int size) {
        if (page < 0) page = 0;
        if (size < 1) size = 10;

        return this.questionRepository.findAll(PageRequest.of(page, size))
                .map((entity) -> this.questionMapper.entityToResponse(entity));
    }

    @Override
    public QuestionResponse update(Long id, QuestionRequest request) {

        QuestionEntity question = this.questionMapper.requestToEntity(request);
        question.setId(id);

        return this.questionMapper.entityToResponse(this.questionRepository.save(question));
    }

    @Override
    public void delete(Long id) {
        QuestionEntity question = this.serviceHelper.find(id, QuestionRepository, "question");
        this.questionRepository.delete(question);
    }
}
