package com.example.rabbitproducer.producer;

public interface RabbitMqProducerService {
    void sendMessage(String message, String routingKey);
}
