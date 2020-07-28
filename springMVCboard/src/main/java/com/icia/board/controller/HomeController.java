package com.icia.board.controller;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.icia.board.bean.Member;
import com.icia.board.service.MemberMM;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private MemberMM mm;

	ModelAndView mav;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "login";
	}
	@RequestMapping(value = "/access", method = RequestMethod.POST)
	public ModelAndView loginAccess(Member mb, HttpSession session) {
	
		mav = mm.LoginAccess(mb,session);
		return mav;
	}
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "joinFrm";
	}
	@RequestMapping(value = "/joinaccess", method = RequestMethod.POST)
	public ModelAndView joinAccess(Member mb) {
		mav = mm.joinAccess(mb);
		return mav;
	}
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		return "main";
	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/"; //redirect:url,POST,GET--->GET방식
	}
}
