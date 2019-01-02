package net.proselyte.springioc.aopSpringExampleAnotation;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logining {
    @Pointcut("execution(* net.proselyte.springioc.aopSpringExampleAnotation.*.*(..))")
    public void allMethod(){}

    @Before("allMethod()")
    public void beforeAdvice(){
        System.out.println("We have BEFORE ADVICE method.\n");
    }

    @After("allMethod()")
    public void afterAdvice(){
        System.out.println("We have AFTER ADVICE method.\n");
    }

    @AfterReturning(pointcut = "allMethod()", returning = "object")
    public void afterReturningAdvice(Object object){
        System.out.println("We have AFTER RETURNING EDVICE method. \n" + object.toString());
    }

    @AfterThrowing(pointcut = "allMethod()", throwing = "e")
    public void exceptionThrowAdvice(ClassCastException e){
        System.out.println("We have EXCEPTION \n" + e.toString());
    }
}
