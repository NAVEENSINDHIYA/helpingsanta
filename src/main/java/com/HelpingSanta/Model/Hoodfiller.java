package com.HelpingSanta.Model;


import java.util.Arrays;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Hoodfiller {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	private String hood_capacity;
	
	
	
	private String[] present_weights;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHood_capacity() {
		return hood_capacity;
	}
	public void setHood_capacity(String hood_capacity) {
		this.hood_capacity = hood_capacity;
	}
	public String[] getPresent_weights() {
		return present_weights;
	}
	public void setPresent_weights(String[] present_weights) {
		this.present_weights = present_weights;
	}
	@Override
	public String toString() {
		return "Hoodfiller [id=" + id + ", hood_capacity=" + hood_capacity + ", present_weights="
				+ Arrays.toString(present_weights) + "]";
	}
	public Hoodfiller(int id, String hood_capacity, String[] present_weights) {
		super();
		this.id = id;
		this.hood_capacity = hood_capacity;
		this.present_weights = present_weights;
	}
	public Hoodfiller() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	
	
	
	
}
