package com.mybatis.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dto.Board;

public class BoardDaoImpl implements BoardDao {

	@Override
	public List<Board> searchBoardAll(SqlSession session, Map<String,Integer> page) {
		// TODO Auto-generated method stub
		RowBounds rb = new RowBounds((page.get("cPage")-1)*page.get("numPerpage"),page.get("numPerpage"));
		return session.selectList("board.searchboardall",null, rb);
	}

}
