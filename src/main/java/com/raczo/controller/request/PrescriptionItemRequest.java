package com.raczo.controller.request;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PrescriptionItemRequest {
    private String productType;
    private String productCode;
    private String description;
    private Boolean approved;

}
