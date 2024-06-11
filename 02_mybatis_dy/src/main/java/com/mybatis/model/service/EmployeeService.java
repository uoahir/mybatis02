package com.mybatis.model.service;

import static com.mybatis.common.SessionTemplate.getSession;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dao.EmployeeDao;

public class EmployeeService {
	private EmployeeDao dao= new EmployeeDao();
	
	public List<Map<String,Object>> searchAllEmployeeMap(){
		SqlSession session = getSession();
		List<Map<String,Object>> result = dao.searchAllEmployeeMap(session);
		session.close();
		return result;
	}
}
