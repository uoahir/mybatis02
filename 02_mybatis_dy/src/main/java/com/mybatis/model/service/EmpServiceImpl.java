package com.mybatis.model.service;

import static com.mybatis.common.SessionTemplate.getSession;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dao.EmpDao;
import com.mybatis.model.dao.EmpDaoImpl;
import com.mybatis.model.dto.Department;
import com.mybatis.model.dto.Employee;

public class EmpServiceImpl implements EmpService {
	
	private EmpDao dao = new EmpDaoImpl();
	
	@Override
	public List<Employee> selectEmployeeAll() {
		// 전체사원 조회 !
		SqlSession session = getSession();
		List<Employee> result = dao.selectEmployeeAll(session);
		session.close();
		return result;
	}

	@Override
	public Employee selectEmployeeByEmpId(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> searchEmp(Map<String, Object> param) {
		SqlSession session = getSession();
		List<Employee> result = dao.searchEmp(session, param);
		session.close();
		return result;
	}
	
	@Override
	public Department selectDeptById(String id) {
		SqlSession session = getSession();
		Department dept = dao.selectDeptById(session, id);
		session.close();
		return dept;
	}
	
	
}
