package com.raczo.controller.request;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class InsurerWorkerPayloadRequest {
    @NotEmpty
    private String type;

    private Date createdAt;
    private ProviderRequest provider;
    private DoctorRequest doctor;
    private PolicyHolderRequest policyHolder;
    private String couponVerificationCode;
    private String prescriptionVerificationCode;
    private List<DiagnosisRequest> diagnoses;
    private Date illnesOnset;
    private Boolean hasPrescription;
    private List<PrescriptionItemRequest> prescriptionItems;
    private List<AuthorizationRequest> authorizations;
}
