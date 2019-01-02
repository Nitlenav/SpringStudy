package net.proselyte.springioc.configurationAnnotationJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Данная анотация показывает что этот класс является конфигурируемым для AnnotationConfigApplicationContext
@Configuration
public class MessageConfig {

    //Данная анотация показывает что этот метод возвращает обьект и должен быть зарегистрирован как Been
    @Bean
    public Message printMessage(){
        return new Message();
    }

}
