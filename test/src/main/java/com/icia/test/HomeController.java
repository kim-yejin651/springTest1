package com.icia.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.icia.test.bean.Person;
import com.icia.test.bean.Student;
import com.icia.test.service.MemberMM;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private Person obj;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		MemberMM mm = new MemberMM();
		//res.setContentType("text/html;charset=utf-8");
		ModelAndView mav = mm.acceess();
		String sleep = obj.sleep();
		return mav;
	}
	
}
