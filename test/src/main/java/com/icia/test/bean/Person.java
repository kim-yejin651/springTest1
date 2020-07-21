package com.icia.test.bean;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class Person {

	private String id;
	private String pw;
	private int age;
	
	public String sleep() {
		return "사람은 8시간 잔다.";
	}
	
}
