import com.conference.service.SpeakerService;
import com.conference.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		SpeakerService speaker = new SpeakerServiceImpl();
		
		System.out.println(speaker.findAll().get(0).getFirstName());
	}
}
