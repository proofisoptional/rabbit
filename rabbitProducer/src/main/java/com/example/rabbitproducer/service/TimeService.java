package com.example.rabbitproducer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import com.example.rabbitproducer.producer.RabbitMqProducerService;

import java.time.LocalDateTime;

@Service
@EnableScheduling
public class TimeService {
    private static Logger logger = LoggerFactory.getLogger(TimeService.class);
    RabbitMqProducerService rabbitMqProducerService;

    public TimeService(RabbitMqProducerService rabbitMqProducerService) {
        this.rabbitMqProducerService = rabbitMqProducerService;
    }

    @Scheduled(fixedDelay = 2000)
    public void sendMessageAboutTime() throws InterruptedException{
        System.out.println("scheduled job");
        String message = "Current time is: " + LocalDateTime.now();
        rabbitMqProducerService.sendMessage(message, "routing_key1");
    }

    @Scheduled(fixedDelay = 5000)
    public void sendNoSenseMessage() throws InterruptedException{
        System.out.println("scheduled job for second queue");
        String message = "Message to superRoutingKey " + LocalDateTime.now();
        rabbitMqProducerService.sendMessage(message, "routing_key3");
    }
}
