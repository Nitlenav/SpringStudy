package net.proselyte.springioc.anotationJSR;

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

    //Анотация свидетельствует, что данный метод вызывается перед инициализацией бина.
    @PostConstruct
    public void methodInit() {
        System.out.println("Been INIT method.");
    }

    //Анотация свидетельствует, что данный метод вызывается после инициализацией бина.
    @PreDestroy
    public void methodDestroue() {
        System.out.println("Been DESTROUE method.");
    }
}
