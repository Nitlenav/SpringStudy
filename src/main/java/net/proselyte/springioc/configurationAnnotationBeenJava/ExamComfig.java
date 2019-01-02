package net.proselyte.springioc.configurationAnnotationBeenJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ExamComfig {

    @Bean
    public Exam exam(){
        return new Exam(answerChecker());
    }

    @Bean
    public AnswerChecker answerChecker(){
        return new AnswerChecker();
    }



}
