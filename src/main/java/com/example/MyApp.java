package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        MessageService messageService = applicationContext.getBean("myNameMessageService", MessageService.class);
        MessageService messageService2 = applicationContext.getBean("myNameMessageService", MessageService.class);
        MessageService messageService3 = applicationContext.getBean("randomTextMessageService", MessageService.class);
        System.out.println(messageService.getMessage());
        System.out.println(messageService2.getMessage());
        System.out.println(messageService.hashCode());
        System.out.println(messageService2.hashCode());
        System.out.println(messageService3.getMessage());


    }
}
