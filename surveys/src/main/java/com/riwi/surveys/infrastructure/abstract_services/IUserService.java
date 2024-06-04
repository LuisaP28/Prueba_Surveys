package com.riwi.surveys.infrastructure.abstract_services;

import com.riwi.surveys.api.dto.request.UserRequest;
import com.riwi.surveys.api.dto.response.UserResponse;

public interface IUserService extends ServiceBase<UserRequest, UserResponse, Long> {
    
}
