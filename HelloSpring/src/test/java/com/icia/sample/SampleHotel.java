package com.icia.sample;

import org.springframework.stereotype.Component;

@Component
public class SampleHotel {
	
	private Chef chef;
	
	public SampleHotel(Chef chef) {
		this.chef = chef;
	}
	
}
