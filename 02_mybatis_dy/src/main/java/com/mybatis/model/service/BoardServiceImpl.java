package com.mybatis.model.service;

import static com.mybatis.common.SessionTemplate.getSessionWeb;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dao.BoardDao;
import com.mybatis.model.dao.BoardDaoImpl;
import com.mybatis.model.dto.Board;

public class BoardServiceImpl implements BoardService {
	
	private BoardDao dao = new BoardDaoImpl();
	
	@Override
	public List<Board> searchAllBoard(Map<String,Integer> page) {
		SqlSession session = getSessionWeb();
		List<Board> result = dao.searchBoardAll(session,page);
		session.close();
		return result;
	}

}
