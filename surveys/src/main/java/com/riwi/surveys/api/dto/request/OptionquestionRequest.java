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
public class OptionquestionRequest {
    @NotBlank(message = "Text is required")
    private String text;
    @NotBlank(message = "Active or desactive is required")
    private Boolean active;
}
