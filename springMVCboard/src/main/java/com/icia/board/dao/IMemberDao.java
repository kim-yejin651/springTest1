package com.icia.board.dao;

import com.icia.board.bean.Member;

public interface IMemberDao {
	public boolean getLoginResult(Member mb);
	public boolean getJoinResult(Member mb);
	public String getSecurityPw(String m_id);
	public Member getMemberInfo(String m_id);
}
