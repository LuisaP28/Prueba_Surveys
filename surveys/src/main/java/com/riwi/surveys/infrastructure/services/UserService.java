package com.riwi.surveys.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.riwi.surveys.api.dto.request.UserRequest;
import com.riwi.surveys.api.dto.response.UserResponse;
import com.riwi.surveys.domain.entities.UserEntity;
import com.riwi.surveys.domain.repositories.UserRepository;
import com.riwi.surveys.infrastructure.abstract_services.IUserService;
import com.riwi.surveys.infrastructure.helpers.ServiceHelper;
import com.riwi.surveys.infrastructure.helpers.abstract_mappers.IUserMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements IUserService {
     @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final ServiceHelper serviceHelper;

    @Autowired
    private final IUserMapper userMapper;

    @Override
    public UserResponse create(UserRequest request) {
        UserEntity user = this.userMapper.requestToEntity(request);
        return this.userMapper.entityToResponse(this.userRepository.save(user));
    }

    @Override
    public UserResponse get(Long id) {
        UserEntity user = this.serviceHelper.find(id, userRepository, "user");
        return this.userMapper.entityToResponse(user);
    }

    @Override
    public Page<UserResponse> getAll(int page, int size) {
        if (page < 0) page = 0;
        if (size < 1) size = 10;

        return this.userRepository.findAll(PageRequest.of(page, size))
                .map((entity) -> this.userMapper.entityToResponse(entity));
    }

    @Override
    public UserResponse update(Long id, UserRequest request) {

        UserEntity user = this.userMapper.requestToEntity(request);
        user.setId(id);

        return this.userMapper.entityToResponse(this.userRepository.save(user));
    }

    @Override
    public void delete(Long id) {
        UserEntity user = this.serviceHelper.find(id, userRepository, "user");
        this.userRepository.delete(user);
    }
}
