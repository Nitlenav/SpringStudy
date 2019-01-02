package net.proselyte.springioc.springEvent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunners {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("message-event-handling-config.xml");
        context.start();
        Message message = (Message)context.getBean("message");
        System.out.println(message.toString());
        context.stop();
    }
}