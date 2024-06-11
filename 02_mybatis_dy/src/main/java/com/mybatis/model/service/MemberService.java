package com.mybatis.model.service;

import java.util.List;
import java.util.Map;

import com.mybatis.model.dto.Member;

public interface MemberService {
	List<Member> searchMemberAll(Map<String,Integer> paging);
	
	List<Member> searchMemberList(Map<String,Object> param); // 숙재입니당 . . ! 
	// 위에 두개를 모두 합쳐서 하나로 만들고 동적쿼리로 로직을 짜도 됨 !!! ㅋ 
}
