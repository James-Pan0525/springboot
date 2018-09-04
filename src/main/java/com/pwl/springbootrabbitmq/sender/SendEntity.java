package com.pwl.springbootrabbitmq.sender;

import com.pwl.springbootrabbitmq.entity.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendEntity {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(User user) {

        this.rabbitTemplate.convertAndSend("object", user);
    }
}
