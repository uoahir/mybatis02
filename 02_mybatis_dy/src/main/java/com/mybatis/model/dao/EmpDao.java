package com.mybatis.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dto.Department;
import com.mybatis.model.dto.Employee;

public interface EmpDao {
	List<Employee> selectEmployeeAll(SqlSession session);
	List<Employee> searchEmp(SqlSession session, Map<String,Object> param);
	Department selectDeptById(SqlSession session, String deptId);
}
