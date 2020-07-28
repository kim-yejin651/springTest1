package com.icia.board.dao;

import java.util.List;

import com.icia.board.bean.Board;

public interface IBoardDao {

	List<Board> getBoardList(Integer pageNum);
	
}
