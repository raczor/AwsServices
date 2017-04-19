package com.raczo.controller.request;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class AuthorizationRequest {
    private String type;
    private String code;
    private String pin;
    private List<AuthorizationItemRequest> items;

}
