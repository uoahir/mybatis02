package com.mybatis.model.service;

import static com.mybatis.common.SessionTemplate.getSessionWeb;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dao.MemberDao;
import com.mybatis.model.dao.MemberDaoImpl;
import com.mybatis.model.dto.Member;


public class MemberServiceImpl implements MemberService {
	private MemberDao dao = new MemberDaoImpl();
	
	@Override
	public List<Member> searchMemberAll(Map<String,Integer> paging) {
		SqlSession session = getSessionWeb();
		List<Member> result =dao.searchAllMember(session, paging);
		session.close();
		return result;
	}

	@Override
	public List<Member> searchMemberList(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
