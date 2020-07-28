package com.icia.board.service;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import com.icia.board.bean.Member;
import com.icia.board.dao.IMemberDao;

@Component
public class MemberMM {

	@Autowired
	private IMemberDao mDao;

	ModelAndView mav;

	public ModelAndView LoginAccess(Member mb, HttpSession session) {
		mav = new ModelAndView();
		BCryptPasswordEncoder pwEncoder = new BCryptPasswordEncoder();
		String pwEncode = mDao.getSecurityPw(mb.getM_id());
		if (pwEncode != null) {
			if (pwEncoder.matches(mb.getM_pw(), pwEncode)) {
				session.setAttribute("id", mb.getM_id());
				mb = mDao.getMemberInfo(mb.getM_id());
				session.setAttribute("mb", mb);
				mav.setViewName("redirect:/boardlist");
				mav.addObject("msg", "로그인 성공");
			} else {
				mav.setViewName("home");
				mav.addObject("msg", "로그인 실패");
			}
		} else {
			mav.setViewName("home");
			mav.addObject("msg", "로그인 실패");
		}
		return mav;
	}

	public ModelAndView joinAccess(Member mb) {
		mav = new ModelAndView();
		// Encoder(암호화) <---> Decoder(복호화)
		BCryptPasswordEncoder pwEncoder = new BCryptPasswordEncoder();
		mb.setM_pw(pwEncoder.encode(mb.getM_pw()));
		System.out.println(mb.getM_pw());
		if (mDao.getJoinResult(mb)) {
			mav.addObject("check", 1);
			mav.setViewName("login");
		} else {
			mav.addObject("check", 0);
			mav.setViewName("join");
		}
		return mav;
	}

}
