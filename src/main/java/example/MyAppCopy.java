package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppCopy {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
//        MessageService messageService2 = applicationContext.getBean("randomMessageService", MessageService.class);
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MessageConfig.class);

        MyNameMessageService messageService = ctx.getBean(MyNameMessageService.class);
        RandomTextMessageService messageService1 = ctx.getBean(RandomTextMessageService.class);
        System.out.println(messageService.hashCode());
        System.out.println(messageService1.hashCode());
        System.out.println(messageService.getMessage());
        System.out.println(messageService1.getMessage());

        applicationContext.close();
    }
}

