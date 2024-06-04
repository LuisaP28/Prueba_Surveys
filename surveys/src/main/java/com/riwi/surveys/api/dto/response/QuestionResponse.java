package com.riwi.surveys.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuestionResponse {
     private Long id; 
    private String text;
    private String type;
    private Long surveyId;
    private Boolean active;
}
