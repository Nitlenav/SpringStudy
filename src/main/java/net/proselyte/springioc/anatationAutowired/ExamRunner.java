package net.proselyte.springioc.anatationAutowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("anotationConfigAutowired.xml");
        Exam exam = (Exam)context.getBean("examen");
        System.out.println("\n======================================");
        exam.examCheck();
    }
}
