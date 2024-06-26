package com.riwi.surveys.api.error_handler;

import java.io.Serializable;
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
public class ErrorSimpleResponse implements Serializable {
    private String status;
    private Integer code;
    private Map<String, String> error;
}
