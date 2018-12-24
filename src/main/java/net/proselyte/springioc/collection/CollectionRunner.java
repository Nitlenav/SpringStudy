package net.proselyte.springioc.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collections-example.xml");

        Collection collections = (Collection)context.getBean("collections");
        collections.getList();
        System.out.println("\n======================================");
        collections.getSet();
        System.out.println("\n======================================");
        collections.getMap();
        System.out.println("\n======================================");
        collections.getProperties();


    }
}
