package com.example.rabbitproducer.model;

import lombok.Data;

@Data
public class MessageModel {
    private String message;
    private String routingKey;
}
