package com.mybatis.model.service;

import java.util.List;
import java.util.Map;

import com.mybatis.model.dto.Board;

public interface BoardService {
	List<Board> searchAllBoard(Map<String,Integer> page);
}
