package com.icia.today.bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.icia.test.bean.Person;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

@Component
@Data
@Accessors(chain = true)
public class Member extends Person{

	private String id;
	private String pw;
	
	@Setter(onMethod_ = @Autowired)
	private int age;
}
