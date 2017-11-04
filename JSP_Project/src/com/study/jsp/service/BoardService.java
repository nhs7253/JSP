package com.study.jsp.service;

import java.util.List;

import com.study.jsp.vo.Board;

public interface BoardService {
	
	List<Board> getBoardList();
	
	Board getBoardListByNum(int selectNum);
	
	void insertBoardData(Board insertdata); ///입력 받는 경우일 경우 돌려받는 값이 필요 없는 경우 void로 선언
		
}

