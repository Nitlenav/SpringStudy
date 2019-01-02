package net.proselyte.springioc.springEventListener;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("eventConfig.xml");
        EventPublisher publisher = (EventPublisher)context.getBean("eventPublisher");
        publisher.publishEvent();
    }
}
