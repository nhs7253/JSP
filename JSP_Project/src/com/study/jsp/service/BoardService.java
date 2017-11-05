package com.study.jsp.service;

import java.util.List;

import com.study.jsp.vo.Board;

public interface BoardService {
	
	List<Board> getBoardList();
	
	Board getBoardListByNum(int selectNum);
	
	void insertBoardData(Board insertdata); ///입력 받는 경우일 경우 돌려받는 값이 필요 없는 경우 void로 선언
		
	void updateBoardData(Board updateData);
	
	void deleteBoardDate(int keyNumber);// 딜리트를 수행하기 위해 입력 받아야할 파라메터는 int 키값이므로 정의를 int KeyNumber로 한다
	
}

