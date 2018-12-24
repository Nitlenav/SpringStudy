package net.proselyte.springioc.inheritance;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunners {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("message-extend.xml");
        Message message = (Message) context.getBean("message");
        System.out.printf("First message.");
        System.out.println(message.getMessage());
        System.out.println("\n======================================\n");
        System.out.printf("Second message.");
        MessageToYou messageToYou = (MessageToYou) context.getBean("messageToYou");
        System.out.println(messageToYou.getMessage());
        System.out.println(messageToYou.getMessageToYou());
    }
}