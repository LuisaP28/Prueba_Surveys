package com.riwi.surveys.infrastructure.helpers.abstract_mappers;

import com.riwi.surveys.api.dto.request.UserRequest;
import com.riwi.surveys.api.dto.response.UserResponse;
import com.riwi.surveys.domain.entities.UserEntity;

public interface IUserMapper extends MapperBase<UserRequest, UserEntity, UserResponse> {
    
}
