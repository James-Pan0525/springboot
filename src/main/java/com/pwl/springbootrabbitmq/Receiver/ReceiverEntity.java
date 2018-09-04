package com.pwl.springbootrabbitmq.Receiver;

import com.pwl.springbootrabbitmq.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiverEntity {
    @RabbitListener(queues = "object")
    @RabbitHandler
    public void process(User user) {
        System.out.println("Receiver entity : " + user.toString());
    }
}
