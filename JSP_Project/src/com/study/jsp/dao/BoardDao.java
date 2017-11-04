package com.study.jsp.dao;

import java.util.List;

import com.study.jsp.vo.Board;

public interface BoardDao {
	
	List<Board> selectBoardAll();
}
