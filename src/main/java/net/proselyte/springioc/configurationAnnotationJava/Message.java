package net.proselyte.springioc.configurationAnnotationJava;

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
        return "Message:"+ "\n" +
                "message = " + this.message;
    }
}
