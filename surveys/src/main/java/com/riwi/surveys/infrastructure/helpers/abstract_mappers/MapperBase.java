package com.riwi.surveys.infrastructure.helpers.abstract_mappers;

public interface MapperBase <RequestDTO, Entity ,ResponseDTO>{
    Entity requestToEntity(RequestDTO request);

    ResponseDTO entityToResponse(Entity entity);
}
