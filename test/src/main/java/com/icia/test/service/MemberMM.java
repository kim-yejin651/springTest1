package com.icia.test.service;

import org.springframework.web.servlet.ModelAndView;

public class MemberMM {

	public ModelAndView acceess() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg","login failed");
		mav.setViewName("home");
		return mav;
	}

}
