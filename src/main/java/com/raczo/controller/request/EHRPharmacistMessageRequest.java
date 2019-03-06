package com.raczo.controller.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EHRPharmacistMessageRequest {
    private String uuid;
    private String action;
    private String source;
    private Payload payload;

    @Getter
    @Setter
    public static class Payload {
        private String messageId;
        private Long prescriptionId;
        private String message;
        private String pharmacyName;
        private Date createdAt;
    }

}
