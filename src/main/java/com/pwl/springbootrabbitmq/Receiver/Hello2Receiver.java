package com.pwl.springbootrabbitmq.Receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class Hello2Receiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver 2 : " + hello);
    }
}
