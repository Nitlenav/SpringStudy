package net.proselyte.springioc.firstProject;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("message-bean.xml");

        Message message = (Message) context.getBean("printMessage");
        System.out.println(message.getMessage());

        context.registerShutdownHook();
    }
}
