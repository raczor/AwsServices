package com.raczo.controller;

import com.raczo.controller.request.EHRPharmacistMessageRequest;
import com.raczo.controller.request.InsurerWorkerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import java.util.Date;
import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class SendAwsMessage {

    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;

    @RequestMapping(path = "/insurer-worker/post-prescription/send", method = GET)
    @ResponseStatus(HttpStatus.OK)
    public String  sendMessage() {
        final EHRPharmacistMessageRequest.Payload payload = new EHRPharmacistMessageRequest.Payload();
        payload.setPrescriptionId(205L);
        payload.setMessage("TEST");
        payload.setCreatedAt(new Date());
        payload.setMessageId(UUID.randomUUID().toString());
        payload.setPharmacyName("Pharmacy Name ElSimi");

        final EHRPharmacistMessageRequest ehrPharmacistMessageRequest = new EHRPharmacistMessageRequest();
        ehrPharmacistMessageRequest.setAction("MESSAGE_ADDED");
        ehrPharmacistMessageRequest.setUuid(UUID.randomUUID().toString());
        ehrPharmacistMessageRequest.setSource("TEST");
        ehrPharmacistMessageRequest.setPayload(payload);


        queueMessagingTemplate.convertAndSend("test-sdk", ehrPharmacistMessageRequest);

        return "OK";
    }
}
