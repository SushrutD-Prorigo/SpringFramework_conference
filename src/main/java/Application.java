import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.conference.service.SpeakerService;
import com.conference.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext= new AnnotationConfigApplicationContext(AppConfig.class);
		
		//SpeakerService speaker = new SpeakerServiceImpl();// setter injection
		SpeakerService speaker =appContext.getBean("speakerService",SpeakerService.class);
		
		System.out.println(speaker);
		System.out.println(speaker.findAll().get(0).getFirstName());
		
		SpeakerService speaker2 =appContext.getBean("speakerService",SpeakerService.class);
		
		System.out.println(speaker2);
	}
}
