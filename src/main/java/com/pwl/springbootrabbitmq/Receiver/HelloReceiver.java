package com.pwl.springbootrabbitmq.Receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloReceiver {

    @RabbitListener(queues = "hello")
    @RabbitHandler
    public void process(String hello) {

        System.out.println("Receiver 1 : " + hello);
    }
}
