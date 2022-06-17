package com.HelpingSanta.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.HelpingSanta.Model.Hoodfiller;
import com.HelpingSanta.Service.Helper;
import com.HelpingSanta.Service.HoodfillerService;

@RestController
public class HoodfillerController {

	@Autowired Helper helper;
	
	@Autowired HoodfillerService service;
	
	@PostMapping(path = "/hoodfiller")
	public List<Integer> minimumHoods(@RequestBody Hoodfiller hoodfiller){
	  String hood_capacity= hoodfiller.getHood_capacity();
	  String[] present_weights= hoodfiller.getPresent_weights();
	  
	  service.save(hoodfiller);
	  
	// System.out.println(present_weights);
			return helper.getMinimumHoods(hood_capacity, present_weights); 
	}
}
