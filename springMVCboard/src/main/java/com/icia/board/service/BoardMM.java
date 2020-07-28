package com.icia.board.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.icia.board.bean.Board;
import com.icia.board.dao.IBoardDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardMM {
	
	@Autowired
	private IBoardDao bDao;
	ModelAndView mav;
	
	public ModelAndView getBoardList(Integer pageNum,HttpSession session) {
		pageNum = (pageNum==null)?1:pageNum;
		mav = new ModelAndView();
		List<Board> bList = bDao.getBoardList(pageNum);
		if(bList!=null||bList.size()!=0) {
			mav.addObject("bList", bList);
			mav.addObject("bList2", new Gson().toJson( bList));
		}
		mav.setViewName("boardList");
		return mav;
	}
	
}
