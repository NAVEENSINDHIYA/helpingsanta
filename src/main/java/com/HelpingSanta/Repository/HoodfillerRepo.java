package com.HelpingSanta.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HelpingSanta.Model.Hoodfiller;
@Repository
public interface HoodfillerRepo extends JpaRepository<Hoodfiller, Integer>{

	
	
	
}
