package rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
public class RabbitMqConsumer {
    @RabbitListener(queues = "queue_2")
    public void process(String message){
        System.out.printf("Received from myQueue2 : %s \n", new String(message.getBytes()));

    }
}
