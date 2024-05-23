package com.example.rabbitredirect.producer;

public interface RabbitProducerService {
    void sendMessage(String message, String routingKey);
}
