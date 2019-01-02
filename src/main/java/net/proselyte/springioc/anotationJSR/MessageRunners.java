package net.proselyte.springioc.anotationJSR;

import net.proselyte.springioc.inheritance.MessageToYou;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunners {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotation-JSR250.xml");
        Message message = (Message) context.getBean("printMessage");
        System.out.printf("First message.\n");
        System.out.println(message.getMessage());
        System.out.println("\n======================================\n");
        System.out.printf("Second message.\n");
        context.registerShutdownHook();
    }
}