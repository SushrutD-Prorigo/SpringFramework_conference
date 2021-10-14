package com.conference.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.conference.model.Speaker;
import com.conference.repository.HibernateSpeakerRepositoryImpl;
import com.conference.repository.SpeakerRepository;

@Component("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repository;
	
	public SpeakerServiceImpl() {
		System.out.println("Inside Speaker service impl def const");
	}
	
	
	public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		System.out.println("Inside Speaker service impl param const");
		this.repository=speakerRepository;
	}
	
	public List<Speaker> findAll(){
		return repository.findAll();
	}

	@Autowired
	public void setRepository(SpeakerRepository repository) {
		System.out.println("Inside setter");
		this.repository = repository;
	}

	 
}
