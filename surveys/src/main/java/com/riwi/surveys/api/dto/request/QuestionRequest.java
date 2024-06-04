package com.riwi.surveys.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuestionRequest {
    @NotBlank(message = "Text is required")
    private String text;
    @NotBlank(message = "Type is required")
    private String type;
    private Long surveyId;
    @NotBlank(message = "Active or desactive is required")
    private Boolean active;
}
