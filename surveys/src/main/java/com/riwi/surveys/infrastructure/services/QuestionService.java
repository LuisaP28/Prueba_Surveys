package com.riwi.surveys.infrastructure.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class QuestionService {
    
  
    // @Autowired
    // private final ServiceHelper serviceHelper;

    // @Autowired
    // private ISurveyMapper surveyMapper;

    // @Override
    // public QuestionResponse create(QuestionRequest request) {
    //     QuestionEntity question = this.questionMapper.requestToEntity(request);
    //     return this.questionMapper.entityToResponse(this.questionRepository.save(question));
    // }

    // @Override
    // public QuestionResponse get(Long id) {
    //     QuestionEntity question = this.serviceHelper.find(id, questionRepository, "question");
    //     return this.questionMapper.entityToResponse(question);
    // }

    // @Override
    // public Page<QuestionResponse> getAll(int page, int size) {
    //     if (page < 0) page = 0;
    //     if (size < 1) size = 10;

    //     return this.questionRepository.findAll(PageRequest.of(page, size))
    //             .map((entity) -> this.questionMapper.entityToResponse(entity));
    // }

    // @Override
    // public QuestionResponse update(Long id, QuestionRequest request) {

    //     QuestionEntity question = this.questionMapper.requestToEntity(request);
    //     question.setId(id);

    //     return this.questionMapper.entityToResponse(this.questionRepository.save(question));
    // }

    // @Override
    // public void delete(Long id) {
    //     QuestionEntity question = this.serviceHelper.find(id, QuestionRepository, "question");
    //     this.questionRepository.delete(question);
    // }
}
