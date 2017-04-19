package com.raczo.controller;

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
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class SendAwsMessage {
    private static final String DEFAULT_TRACKING_QUEUE_NAME = "gt-mediprocesos-insurer-worker-dev";

    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;

    @RequestMapping(
            path = "/insurer-worker/post-prescription/send",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public HttpEntity sendMessage(@Valid @RequestBody InsurerWorkerRequest insurerWorkerRequest) {
        queueMessagingTemplate.convertAndSend(DEFAULT_TRACKING_QUEUE_NAME, insurerWorkerRequest);

        return new ResponseEntity(HttpStatus.CREATED);
    }
}
