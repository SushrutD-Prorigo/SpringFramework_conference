package com.conference.service;

import java.util.List;

import com.conference.model.Speaker;
import com.conference.repository.HibernateSpeakerRepositoryImpl;
import com.conference.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repository;
	
	public SpeakerServiceImpl()
	{
		
	}
	
	public SpeakerServiceImpl(SpeakerRepository repo)
	{
	this.repository=repo;	
	}
	public List<Speaker> findAll(){
		return repository.findAll();
	}

	public void setSpeakerRepository(SpeakerRepository repository) {
		this.repository = repository;
	}

	
}
