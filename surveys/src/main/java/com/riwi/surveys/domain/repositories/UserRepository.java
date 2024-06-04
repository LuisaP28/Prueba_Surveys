package com.riwi.surveys.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.surveys.domain.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
    
}
