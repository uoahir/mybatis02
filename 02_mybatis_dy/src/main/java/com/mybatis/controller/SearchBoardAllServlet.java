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

import com.mybatis.model.dto.Board;
import com.mybatis.model.service.BoardService;
import com.mybatis.model.service.BoardServiceImpl;

/**
 * Servlet implementation class SearchBoardAllServlet
 */
@WebServlet("/member/searchboardall.do")
public class SearchBoardAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchBoardAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int cPage=1, numPerpage=5;
		try {
			cPage=Integer.parseInt(request.getParameter("cPage"));
		} catch(NumberFormatException e) {}
		try {
			cPage=Integer.parseInt(request.getParameter("numPerpage"));
		} catch(NumberFormatException e) {}
		
//		Map<String,Integer> page = new HashMap<String, Integer>();
		BoardService service = new BoardServiceImpl();
		List<Board> boards = service.searchAllBoard(Map.of("cPage",cPage,"numPerpage",numPerpage));
		
		boards.forEach(e->{
			System.out.println(e);
			if(!e.getComments().isEmpty()) {
				e.getComments().forEach(System.out::println);
			}
		});
		
		request.setAttribute("boards", boards);
		
		request.getRequestDispatcher("/WEB-INF/views/board/board.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
