package com.riwi.surveys.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.riwi.surveys.api.dto.request.SurveyRequest;
import com.riwi.surveys.api.dto.request.UserRequest;
import com.riwi.surveys.api.dto.response.SurveyResponse;
import com.riwi.surveys.api.dto.response.UserResponse;
import com.riwi.surveys.domain.entities.SurveyEntity;
import com.riwi.surveys.domain.repositories.SurveyRepository;
import com.riwi.surveys.infrastructure.abstract_services.ISurveyService;
import com.riwi.surveys.infrastructure.helpers.ServiceHelper;
import com.riwi.surveys.infrastructure.helpers.abstract_mappers.ISurveyMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SurveryServices implements ISurveyService {
    
    @Autowired
    private final SurveyRepository surveyRepository;

    @Autowired
    private final ServiceHelper serviceHelper;

    @Autowired
    private final ISurveyMapper surveyMapper;

    @Override
    public SurveyResponse create(SurveyRequest request) {
        SurveyEntity user = this.surveyMapper.requestToEntity(request);
        return this.surveyMapper.entityToResponse(this.surveyRepository.save(survey));
    }

    @Override
    public SurveyResponse get(Long id) {
        SurveyEntity user = this.serviceHelper.find(id, surveyRepository, "survey");
        return this.surveyMapper.entityToResponse(survey);
    }

    @Override
    public Page<SurveyResponse> getAll(int page, int size) {
        if (page < 0) page = 0;
        if (size < 1) size = 10;

        return this.surveyRepository.findAll(PageRequest.of(page, size))
                .map((entity) -> this.surveyMapper.entityToResponse(entity));
    }

    @Override
    public SurveyResponse update(Long id, SurveyRequest request) {

        SurveyEntity survey = this.surveyMapper.requestToEntity(request);
        survey.setId(id);

        return this.surveyMapper.entityToResponse(this.surveyRepository.save(survey));
    }

    @Override
    public void delete(Long id) {
        SurveyEntity survey = this.serviceHelper.find(id, surveyRepository, "survey");
        this.surveyRepository.delete(survey);
    }

}
