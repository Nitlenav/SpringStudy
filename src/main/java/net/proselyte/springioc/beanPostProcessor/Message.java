package net.proselyte.springioc.beanPostProcessor;

public class Message {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("Bean is init now.");
    }

    public void destroy() {
        System.out.println("Bean is destroyed.");
    }
}
