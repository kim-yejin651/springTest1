package com.icia.board.bean;

import org.apache.ibatis.type.Alias;

import lombok.Data;
import lombok.experimental.Accessors;

@Alias("member")
@Data
@Accessors(chain = true)
public class Member {

	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
	private String m_addr;
	private String m_birth;
	private int m_point;
	private String g_name;
	
}
