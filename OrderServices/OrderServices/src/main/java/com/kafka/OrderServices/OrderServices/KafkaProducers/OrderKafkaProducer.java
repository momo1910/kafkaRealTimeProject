package com.kafka.OrderServices.OrderServices.KafkaProducers;

import KafkaEvents.OrderEvent;
import Models.Order;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderKafkaProducer {

    @Value("${spring.kafka.topic.name}")
    private String orderEventTopic;

    KafkaTemplate<String, OrderEvent> kafkaTemplate;

    public OrderKafkaProducer(KafkaTemplate<String, OrderEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendOrderEvent(Order order){
        OrderEvent orderEvent= new OrderEvent();
        orderEvent.setMessageId(String.valueOf(UUID.randomUUID()));
        orderEvent.setOrder(order);
        kafkaTemplate.send(orderEventTopic,orderEvent);
        System.out.println("Order Event sent sucessfully from Order Services"+ orderEvent.toString());
    }
}
