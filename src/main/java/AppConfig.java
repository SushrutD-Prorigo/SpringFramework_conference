import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.conference.repository.HibernateSpeakerRepositoryImpl;
import com.conference.repository.SpeakerRepository;
import com.conference.service.SpeakerService;
import com.conference.service.SpeakerServiceImpl;

@Configuration
@ComponentScan({"com.conference"})
public class AppConfig {
	/*
	@Bean(name = "speakerService")
	@Scope(value = BeanDefinition.SCOPE_SINGLETON)
	public SpeakerService getSpeakerService() {
		SpeakerServiceImpl service = new SpeakerServiceImpl();
		//service.setRepository(getSpeakerRepository()); // constructor injection
		return service;
	}
	
	@Bean(name = "speakerRepository")
	public SpeakerRepository getSpeakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}
*/
}
