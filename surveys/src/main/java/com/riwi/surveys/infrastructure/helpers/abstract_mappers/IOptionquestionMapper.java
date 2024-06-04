package com.riwi.surveys.infrastructure.helpers.abstract_mappers;

import com.riwi.surveys.api.dto.request.OptionquestionRequest;
import com.riwi.surveys.api.dto.response.OptionquestionResponse;
import com.riwi.surveys.domain.entities.OptionquestionEntity;

public interface IOptionquestionMapper extends MapperBase<OptionquestionRequest, OptionquestionEntity, OptionquestionResponse> {
    
}
