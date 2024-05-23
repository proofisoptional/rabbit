//package com.example.rabbitproducer.config;
//
//import lombok.extern.log4j.Log4j2;
//import org.springframework.amqp.core.AmqpAdmin;
//import org.springframework.amqp.core.DirectExchange;
//import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
//import org.springframework.amqp.rabbit.connection.ConnectionFactory;
//import org.springframework.amqp.rabbit.core.RabbitAdmin;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RabbitConf {
//        @Value("${rabbitmq.username}")
//        private String username;
//        @Value("${rabbitmq.password}")
//        private String password;
//        @Value("${rabbitmq.virtual-host}")
//        private String virtualHost;
//        @Bean
//        public ConnectionFactory connectionFactory() {
//            CachingConnectionFactory cachingConnectionFactory  = new CachingConnectionFactory("localhost");
//            cachingConnectionFactory.setUsername(username);
//            cachingConnectionFactory.setPassword(password);
//            cachingConnectionFactory.setVirtualHost(virtualHost);
//
//            return cachingConnectionFactory;
//        }
//
//        @Bean
//        public AmqpAdmin amqpAdmin(){
//            return new RabbitAdmin(connectionFactory());
//        }
//
//        @Bean
//        public RabbitTemplate rabbitTemplate() {
//            return new RabbitTemplate(connectionFactory());
//        }
//
//        @Bean
//        DirectExchange exchange() {
//        return new DirectExchange("testExchange", true, false);
//    }
//
//
//}
