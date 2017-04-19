package com.raczo.controller.request;

import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public class ProviderRequest {
    private String code;
    private String name;
    private String branchName;
    private String companyName;
    private String taxIdentificationNumber;
    private String countryCode;

}
