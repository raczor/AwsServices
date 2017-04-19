package com.raczo.controller.request;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DoctorRequest {
    private String medicalLicense;
    private String name;

}
