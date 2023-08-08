package KafkaConsumer;

import KafkaEvents.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmailKafkaConsumer {

    @KafkaListener(topics ="${spring.kafka.topic.name}",groupId ="${spring.kafka.consumer.group-id}" )
    public void consumeOrderEvent(OrderEvent orderEvent){
        System.out.println("EmailKafka Consumer Recived the message"+ orderEvent.toString());
    }
}
