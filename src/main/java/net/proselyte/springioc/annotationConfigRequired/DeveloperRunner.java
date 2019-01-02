package net.proselyte.springioc.annotationConfigRequired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("anotationQualifier.xml");
        Developer developer = (Developer)context.getBean("developer");
        System.out.println(developer);
    }

}
