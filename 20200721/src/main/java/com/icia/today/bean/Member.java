package com.icia.today.bean;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Member {

	private String id;
	private String pw;
	
	@Setter(onMethod_ = @Autowired)
	private int age;
}
