package com.riwi.surveys.infrastructure.helpers.mappers;

import org.springframework.stereotype.Component;

import com.riwi.surveys.api.dto.request.UserRequest;
import com.riwi.surveys.api.dto.response.UserResponse;
import com.riwi.surveys.domain.entities.UserEntity;
import com.riwi.surveys.infrastructure.helpers.abstract_mappers.IUserMapper;

@Component
public class UserMapper implements IUserMapper{
    @Override
    public UserEntity requestToEntity(UserRequest request) {
        return UserEntity.builder()
                .name(request.getName())
                .email(request.getEmail())
                .active(request.getActive())
                .build();
    }

    @Override
    public UserResponse entityToResponse(UserEntity entity) {
        return UserResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .active(entity.getActive())
                .email(entity.getEmail())
                .build();
    }
}
