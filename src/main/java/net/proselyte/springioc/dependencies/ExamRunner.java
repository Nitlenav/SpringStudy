package net.proselyte.springioc.dependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("exam-config.xml");
        Exam exam = (Exam)context.getBean("exam");
        System.out.println("\n======================================");
        exam.examCheck();
    }
}
