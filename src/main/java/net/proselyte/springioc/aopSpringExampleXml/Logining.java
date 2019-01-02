package net.proselyte.springioc.aopSpringExampleXml;

public class Logining {
    public void beforeAdvice(){
        System.out.println("We have BEFORE ADVICE method.\n");
    }

    public void afterAdvice(){
        System.out.println("We have AFTER ADVICE method.\n");
    }

    public void afterReturningAdvice(Object object){
        System.out.println("We have AFTER RETURNING EDVICE method. \n" + object.toString());
    }

    public void exceptionThrowAdvice(ClassCastException e){
        System.out.println("We have EXCEPTION \n" + e.toString());
    }
}
