package com.example.rabbitredirect.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class RabbitProducerServiceImpl implements RabbitProducerService{
    private final RabbitTemplate rabbitTemplate;

    public RabbitProducerServiceImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void sendMessage(String message, String routingKey) {
        rabbitTemplate.convertAndSend("testExchange2", routingKey, message);
    }
}
