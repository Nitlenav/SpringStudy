package net.proselyte.springioc.configurationAnnotationBeenJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamRunner {
    public static void main(String[] args) {
ApplicationContext context = new AnnotationConfigApplicationContext(ExamComfig.class);
        Exam exam = (Exam)context.getBean("exam");
        System.out.println("\n======================================");
        exam.examCheck();
    }
}
