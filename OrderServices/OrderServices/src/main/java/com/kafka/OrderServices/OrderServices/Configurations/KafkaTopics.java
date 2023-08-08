package com.kafka.OrderServices.OrderServices.Configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopics {

    @Value("${spring.kafka.topic.name}")
    private String orderEventTopic;

}
