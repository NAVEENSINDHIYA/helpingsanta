package com.HelpingSanta.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HelpingSanta.Model.Hoodfiller;
import com.HelpingSanta.Repository.HoodfillerRepo;

@Service
public class HoodfillerService {

	
	@Autowired
	HoodfillerRepo hoodFillerRepo;
	
	public void save(Hoodfiller hoodFiller) {
		hoodFillerRepo.save(hoodFiller);
	}
}
