package com.riwi.surveys.api.dto.errors;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorsResponse {
    private String status;
    private Integer code;
    private List<Map<String,String>> errors;
}
