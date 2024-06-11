package com.mybatis.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.model.dto.Member;
import com.mybatis.model.service.MemberServiceImpl;

/**
 * Servlet implementation class SearchMemberAllServlet
 */
@WebServlet("/member/searchmemberall.do")
public class SearchMemberAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchMemberAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cPage, numPerpage;
		
		cPage=1;
		try{
			cPage = Integer.parseInt(request.getParameter("cPage"));
		} catch(NumberFormatException e) {}
		
		numPerpage = 5;
		try {
			numPerpage = Integer.parseInt(request.getParameter("numPerpage"));
		} catch(NumberFormatException e) {}
		
//		Map<String,Integer> paging = new HashMap<String, Integer>();
//		paging.put("cPage", cPage);
//		paging.put("numPerpage", numPerpage);
//		
//		MemberService service = new MemberServiceImpl();
//		List<Member> members = service.searchMemberAll(paging);
		
		// 페이지바 만드는 거 혼자서 해보기이 ~ 
		List<Member> members = new MemberServiceImpl().searchMemberAll(Map.of("cPage",cPage,"numPerpage",numPerpage));
		
		int totalData=0;
		int totalPage=(int)(Math.ceil((double)totalData/numPerpage));
		int pageBarSize=5;
		int pageNo=((cPage-1)/pageBarSize)*pageBarSize-1;
		StringBuffer sb = new StringBuffer();
		
		if(pageNo==1) {
			sb.append("<spab>[이전]<span>");
		} else {
			sb.append("<a href='"+request.getRequestURI()+"?cPage="+(pageNo-1)+"&numPerpage="+numPerpage+"'>[이전]</a>");
		}
		
		
		request.setAttribute("members", members);
		
		request.getRequestDispatcher("/WEB-INF/views/mem/mem.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
