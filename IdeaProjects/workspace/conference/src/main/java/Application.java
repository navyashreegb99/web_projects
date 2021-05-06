import com.example.model.Speaker;
import com.example.service.SpeakerService;
import com.example.service.SpeakerServiceImpl;

import java.util.List;

public class Application
{
    public static void main(String args[]){
        SpeakerService service=new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }

}
