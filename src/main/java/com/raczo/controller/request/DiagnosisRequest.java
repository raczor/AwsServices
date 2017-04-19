package com.raczo.controller.request;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DiagnosisRequest {
    private String type;
    private String code;
    private String name;
    private String description;

}
