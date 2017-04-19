package com.raczo.controller.request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;

@Getter
@Setter
public class InsurerWorkerRequest {
    @NotEmpty
    private String source;

    @NotEmpty
    private String monitorId;

    @NotEmpty
    private String responseQueue;

    @Valid
    private InsurerWorkerPayloadRequest payload;

}
