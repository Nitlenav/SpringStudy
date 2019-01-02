package net.proselyte.springioc.aopSpringExampleAnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-Developer-config-anotation.xml");
        Developer developer = (Developer)context.getBean("developer");
        System.out.println(developer.toString());
        developer.someException();
    }
}
