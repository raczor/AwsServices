package com.raczo.config.aws;

import com.amazonaws.services.sqs.AmazonSQSAsyncClient;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwsSqsProducerConfig {
    @Bean
    public QueueMessagingTemplate queueMessagingTemplate() {
        return new QueueMessagingTemplate(new AmazonSQSAsyncClient());
    }
}
