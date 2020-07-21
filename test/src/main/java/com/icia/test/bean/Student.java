package com.icia.test.bean;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Data
@Component
public class Student {
	private String name;
	private int sNo;
	
	public void study() {
		System.out.println("학생은 공부한다.");
	}
	public String sleep() {
		return "학생은 6시간 잔다.";
	}

}
