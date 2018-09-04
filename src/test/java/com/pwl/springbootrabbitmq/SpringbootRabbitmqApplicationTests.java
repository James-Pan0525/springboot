package com.pwl.springbootrabbitmq;

import com.pwl.springbootrabbitmq.entity.User;
import com.pwl.springbootrabbitmq.sender.HelloSender;
import com.pwl.springbootrabbitmq.sender.SendEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRabbitmqApplicationTests {

    @Autowired
    private HelloSender helloSender;
    @Autowired
    private SendEntity sendEntity;

    @Test
    public void hello() throws Exception {
        helloSender.send();
    }

    @Test
    public void oneToMany() throws Exception {
        for (int i=1;i<100;i++){
            helloSender.send(String.valueOf(i));
        }
    }

    @Test
    public void testEntity() throws Exception {
        User user=new User();
        user.setId("1");
        user.setName("pwl");
        sendEntity.send(user);
    }
}
