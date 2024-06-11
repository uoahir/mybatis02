package com.mybatis.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dto.Board;

public interface BoardDao {
	List<Board> searchBoardAll(SqlSession session,Map<String,Integer> page);
}
