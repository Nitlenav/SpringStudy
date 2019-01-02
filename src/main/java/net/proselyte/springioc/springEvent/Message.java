package net.proselyte.springioc.springEvent;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Message {
    private String message;

    public String getMessage() {
        return "Message " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "message = " + message ;
    }
}
