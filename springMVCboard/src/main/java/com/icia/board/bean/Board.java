package com.icia.board.bean;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("board")
public class Board {

	private int b_num;     
	private String b_title; 
	private String b_contents;
	private String b_id;
	private Timestamp b_date;
	private int b_view;
	private String m_name;
	
}
