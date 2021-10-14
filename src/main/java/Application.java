import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.conference.service.SpeakerService;
import com.conference.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		ApplicationContext appContext= new ClassPathXmlApplicationContext("applicationContext.xml");
		//SpeakerService speaker = new SpeakerServiceImpl();
		
		SpeakerService speaker = appContext.getBean("speakerService",SpeakerService.class);
		System.out.println(speaker.findAll().get(0).getFirstName());
	}
}
