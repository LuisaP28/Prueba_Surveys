package com.riwi.surveys.infrastructure.services;
import org.springframework.stereotype.Service;



import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SurveryServices{


    // @Override
    // public SurveyResponse create(SurveyRequest request) {
    //     SurveyEntity user = this.surveyMapper.requestToEntity(request);
    //     return this.surveyMapper.entityToResponse(this.surveyRepository.save(survey));
    // }

    // @Override
    // public SurveyResponse get(Long id) {
    //     SurveyEntity user = this.serviceHelper.find(id, surveyRepository, "survey");
    //     return this.surveyMapper.entityToResponse(survey);
    // }

    // @Override
    // public Page<SurveyResponse> getAll(int page, int size) {
    //     if (page < 0) page = 0;
    //     if (size < 1) size = 10;

    //     return this.surveyRepository.findAll(PageRequest.of(page, size))
    //             .map((entity) -> this.surveyMapper.entityToResponse(entity));
    // }

    // @Override
    // public SurveyResponse update(Long id, SurveyRequest request) {

    //     SurveyEntity survey = this.surveyMapper.requestToEntity(request);
    //     survey.setId(id);

    //     return this.surveyMapper.entityToResponse(this.surveyRepository.save(survey));
    // }

    // @Override
    // public void delete(Long id) {
    //     SurveyEntity survey = this.serviceHelper.find(id, surveyRepository, "survey");
    //     this.surveyRepository.delete(survey);
    // }

}
