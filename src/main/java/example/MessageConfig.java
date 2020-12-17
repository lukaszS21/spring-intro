package example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Configuration
public class MessageConfig {
    @Bean
    @Scope("prototype")
    public MyNameMessageService myNameMessageService(){
        return new MyNameMessageService();
    }
    @Bean
    @Scope("prototype")
    public RandomTextMessageService randomTextMessageService(){
        return new RandomTextMessageService();
    }
}