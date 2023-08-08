package kafkaConsumer;

import KafkaEvents.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StockKafkaConsumer {


    @KafkaListener(topics ="${spring.kafka.topic.name}",groupId ="${spring.kafka.consumer.group-id}" )
    public void consumeOrderEvent(OrderEvent orderEvent){
        System.out.println("StockKafka Consumer Recived the message"+ orderEvent.toString());
    }
}
