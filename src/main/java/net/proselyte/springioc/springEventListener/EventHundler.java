package net.proselyte.springioc.springEventListener;

import org.springframework.context.ApplicationListener;

public class EventHundler implements ApplicationListener<Events> {
    @Override
    public void onApplicationEvent(Events events) {
        System.out.println(events.toString());
    }
}
