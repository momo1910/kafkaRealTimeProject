package com.kafka.OrderServices.OrderServices.Controller;


import Models.Order;
import com.kafka.OrderServices.OrderServices.KafkaProducers.OrderKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/submit")
public class OrderController {

    @Autowired
    OrderKafkaProducer orderKafkaProducer;

    @PostMapping("/order")
    public ResponseEntity<String> submitOrders(@RequestBody Order order){
        orderKafkaProducer.sendOrderEvent(order);
        return ResponseEntity.ok("Order submitted Successfully");
    }
}
