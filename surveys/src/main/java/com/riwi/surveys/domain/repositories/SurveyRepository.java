package com.riwi.surveys.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.surveys.domain.entities.SurveyEntity;

@Repository
public interface SurveyRepository extends JpaRepository<SurveyEntity, Long>{
    
}
