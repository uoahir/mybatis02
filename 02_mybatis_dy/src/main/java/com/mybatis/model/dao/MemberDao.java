package com.mybatis.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dto.Member;

public interface MemberDao {
	List<Member> searchAllMember(SqlSession session,Map<String,Integer> paging);
}
