package net.proselyte.springioc.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorInterface implements BeanPostProcessor {

    //метод срабатывает до инициализацией бина
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("BeanPostProcessorInterface Before Initialization method called for " + s);
        return o;
    }

    //метод срабатывает после инициализацией бина
    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("BeanPostProcessorInterface After Initialization method called for " + s);
        return o;
    }
}
