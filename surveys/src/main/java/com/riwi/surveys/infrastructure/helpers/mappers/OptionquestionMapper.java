package com.riwi.surveys.infrastructure.helpers.mappers;

import org.springframework.stereotype.Component;

import com.riwi.surveys.api.dto.request.OptionquestionRequest;
import com.riwi.surveys.api.dto.response.OptionquestionResponse;
import com.riwi.surveys.domain.entities.OptionquestionEntity;
import com.riwi.surveys.infrastructure.helpers.abstract_mappers.IOptionquestionMapper;

@Component
public class OptionquestionMapper implements IOptionquestionMapper {
    
    @Override
    public OptionquestionEntity requestToEntity(OptionquestionRequest request) {
        return OptionquestionEntity.builder()
                .text(request.getText())
                .active(request.getActive())
                .build();
    }

    @Override
    public OptionquestionResponse entityToResponse(OptionquestionEntity entity) {
        return OptionquestionResponse.builder()
                .id(entity.getId())
                .text(entity.getText())
                .active(entity.getActive())
                .build();
    }
}
