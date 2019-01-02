package net.proselyte.springioc.springEventListener;


import org.springframework.context.ApplicationEvent;

public class Events extends ApplicationEvent {
    public Events(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "source = " + source + "\n" +
                "This is EVENT creaty by ME";
    }
}
