package com.riwi.surveys.infrastructure.helpers.mappers;

import org.springframework.stereotype.Component;

import com.riwi.surveys.api.dto.request.SurveyRequest;
import com.riwi.surveys.api.dto.response.SurveyResponse;
import com.riwi.surveys.domain.entities.SurveyEntity;
import com.riwi.surveys.infrastructure.helpers.abstract_mappers.ISurveyMapper;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SurveyMapper implements ISurveyMapper{

    // @Autowired
    // private final  surveryMapper;
    
    @Override
    public SurveyEntity requestToEntity(SurveyRequest request){
    
     return SurveyEntity.builder()
                .title(request.getTitle())
                .description(request.getDescription())
                .creationDate(request.getCreationDate())
                .creatorId(request.getCreatorId())
                .active(request.getActive())
                .build();
    }

    @Override
    public SurveyResponse entityToResponse(SurveyEntity entity) {
        return SurveyResponse.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .description(entity.getDescription())
                .creationDate(entity.getCreationDate())
                .creatorId(entity.getCreatorId())
                .active(entity.getActive())
                .build();
    }
}
