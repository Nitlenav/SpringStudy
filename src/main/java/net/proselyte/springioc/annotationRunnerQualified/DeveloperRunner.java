package net.proselyte.springioc.annotationRunnerQualified;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("anotationConfigQualifier.xml");
        Developer developer = (Developer)context.getBean("position");
        System.out.println(developer);
    }

}
