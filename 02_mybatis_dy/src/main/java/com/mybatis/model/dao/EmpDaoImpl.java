package com.mybatis.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dto.Department;
import com.mybatis.model.dto.Employee;

public class EmpDaoImpl implements EmpDao {

	@Override
	public List<Employee> selectEmployeeAll(SqlSession session) {
		return session.selectList("emp.selectEmpAll");
	}

	@Override
	public List<Employee> searchEmp(SqlSession session, Map<String, Object> param) {
		return session.selectList("emp.searchEmp", param);
	}
	
	@Override
	public Department selectDeptById(SqlSession session, String deptId) {
		return session.selectOne("emp.selectDeptById",deptId);
	}

}
