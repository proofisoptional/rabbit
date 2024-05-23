package com.example.rabbitredirect.consumer;

import com.example.rabbitredirect.producer.RabbitProducerService;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
public class RabbitMqConsumer {

    private final RabbitProducerService producerService;


    public RabbitMqConsumer(RabbitProducerService producerService) {
        this.producerService = producerService;
    }

    @RabbitListener(queues = "queue_1")
    public void process(String message){
        System.out.printf("Received from myQueue : %s \n", new String(message.getBytes()));
        message = "redirect message to consumer 3 " + message;
        producerService.sendMessage(message, "routing_key3");

    }
}
