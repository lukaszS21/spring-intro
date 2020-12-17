package example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Component("RandomMessageService")
public class RandomTextMessageService implements MessageServiceCopy {
    private  List<String> mes=new ArrayList<>(10);
    public RandomTextMessageService()
    {
        Collections.addAll(mes,"Zdanie 1","Zdanie 2","Zdanie 3","Zdanie 4","Zdanie 5","Zdanie 6","Zdanie 7","Zdanie 8","Zdanie 9","Zdanie 10");
    }

    @Override
    public String getMessage() {
        Random random=new Random();
        int i=random.nextInt(10);
        return mes.get(i);
    }
}
