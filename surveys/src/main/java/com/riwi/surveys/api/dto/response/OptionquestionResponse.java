package com.riwi.surveys.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OptionquestionResponse {
    private Long id;
    private String text;
    private Long questionId;
    private Boolean active;
}
