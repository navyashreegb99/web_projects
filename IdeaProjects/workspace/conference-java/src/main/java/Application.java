import com.example.model.Speaker;
import com.example.service.SpeakerService;
import com.example.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application
{
    public static void main(String args[]){
      //  SpeakerService service=new SpeakerServiceImpl();

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService service = appContext.getBean("speakerService",SpeakerService.class);
        //System.out.println(service);

        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service.findAll().get(0).getSeedNum());

       // SpeakerService service2 = appContext.getBean("speakerService",SpeakerService.class);
       // System.out.println(service2);
    }

}
