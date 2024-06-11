package com.mybatis.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.model.dto.Employee;
import com.mybatis.model.service.EmpService;
import com.mybatis.model.service.EmpServiceImpl;

/**
 * Servlet implementation class SearchEmpServlet
 */
@WebServlet("/emp/searchEmp.do")
public class SearchEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmpService service = new EmpServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		String keyword = request.getParameter("keyword");
		String gender = request.getParameter("gender");
		int salary=0;
		try {
			salary = Integer.parseInt(request.getParameter("salary"));
		} catch(NumberFormatException e) {}
		String salFlag = request.getParameter("salFlag");
		List<String> jobCode = List.of(request.getParameterValues("jobCode"));
		
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("type", type);
		param.put("keyword", keyword);
		param.put("gender", gender);
		param.put("salary", salary);
		param.put("salFlag", salFlag);
		param.put("jobs", jobCode);
		
//		Map.of("type",type,"keyword",keyword);
		
		List<Employee> employee = service.searchEmp(param);
		
		request.setAttribute("employee", employee);
		
		request.getRequestDispatcher("/WEB-INF/views/emp/emp.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
