package net.proselyte.springioc.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("exam-config-autowiring.xml");
        Exam exam = (Exam)context.getBean("exam");
        System.out.println("\n======================================");
        exam.examCheck();
        System.out.println("\n======================================\n");
        Exam exams = (Exam)context.getBean("exams");
        System.out.println("\n======================================");
        exams.examCheck();
    }
}
