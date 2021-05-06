import com.example.model.Speaker;
import com.example.service.SpeakerService;
import com.example.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application
{
    public static void main(String args[]){
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");


        //SpeakerService service=new SpeakerServiceImpl();
       SpeakerService service= appContext.getBean("speakerService",SpeakerService.class);
        System.out.println(service.findAll().get(0).getFirstName());
    }

}
