package example;

import org.springframework.stereotype.Component;

@Component("MessageService")
public class MyNameMessageService implements MessageServiceCopy {


    @Override
    public String getMessage() {
        return "Lukasz Stolarz";
    }
}
