package com.icia.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {

	@Setter
	(onMethod_ = @Autowired)
	private Chef chef;
	
}
