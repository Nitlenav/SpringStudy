package net.proselyte.springioc.configurationAnnotationJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageRunners {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
        Message message = context.getBean(Message.class);
        message.setMessage("This is simple message.");
        System.out.println("\n======================================\n");
        System.out.printf(message.toString());
    }
}