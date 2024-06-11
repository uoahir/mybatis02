package com.mybatis.model.service;

import java.util.List;
import java.util.Map;

import com.mybatis.model.dto.Department;
import com.mybatis.model.dto.Employee;

public interface EmpService {
	List<Employee> selectEmployeeAll();
	Employee selectEmployeeByEmpId(int empId);
	List<Employee> searchEmp(Map<String,Object> param);
	public Department selectDeptById(String id);
	
}
