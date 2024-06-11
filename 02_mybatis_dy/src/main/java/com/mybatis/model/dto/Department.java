package com.mybatis.model.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
	private String deptId;
	private String deptTitle;
	private String locationId;
	List<Employee> employees;
}
