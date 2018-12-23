package net.proselyte.springioc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:message-bean.xml");

        Message message = (Message) context.getBean("printMessage");
        System.out.println(message.getMessage());

        context.registerShutdownHook();
    }
}
