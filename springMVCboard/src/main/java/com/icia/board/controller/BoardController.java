package com.icia.board.controller;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.icia.board.service.BoardMM;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	BoardMM bm;
	ModelAndView mav;

	@RequestMapping(value = "/boardlist", method = RequestMethod.GET)
	public ModelAndView getBoardList(Integer pageNum,HttpSession session) {
		mav = bm.getBoardList(pageNum,session);
		return mav;
	}
}
