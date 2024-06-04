package com.riwi.surveys.api.dto.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SurveyRequest {
    @NotBlank(message = "Title is required")
    private String title; 
    private String description;
    @NotBlank(message = "Date is required")
    private LocalDateTime creationDate;
    private Long userId;
    @NotBlank(message = "Active is required")
    private Boolean active;
}
