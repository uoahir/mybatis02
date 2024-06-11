package com.mybatis.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dto.Member;

public class MemberDaoImpl implements MemberDao {

	@Override
	public List<Member> searchAllMember(SqlSession session, Map<String,Integer> paging) {
		RowBounds rb = new RowBounds((paging.get("cPage")-1)*paging.get("numPerpage"), paging.get("numPerpage")); // 머드라 ?
		return session.selectList("mem.searchmemberall",null,rb);
	}

}
