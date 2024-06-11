package com.mybatis.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class EmployeeDao {
	public List<Map<String,Object>> searchAllEmployeeMap(SqlSession session){
		return session.selectList("employee.selectEmployeeAllMap");
	}
}
