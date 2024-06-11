package com.mybatis.model.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude= {"dept"}) // 이거 왜해준거지 ? -> stackOverflow 발생해서

public class Employee {
	private int empId;
	private String empName;
	private String empNo;
	private String email;
	private String phone;
//	private String deptCode; Has a 관계 
	private String jobCode;
	private String salLevel;
	private int salary;
	private double bonus;
	private String managerId;
	private Date hireDate;
	private Date entDate;
	private String gender;
	private Department dept;
}
