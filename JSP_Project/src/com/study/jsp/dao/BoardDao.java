package com.study.jsp.dao;

import java.util.List;

import com.study.jsp.vo.Board;

public interface BoardDao {
	
	List<Board> selectBoardAll();
	
	int selectBoardCount();
	
	Board selectBoardByNumber(int number);//1. 반환을 할 리턴타입은 Board 하고 파라메터는 int //2. 파라메터를 int 정하는 건 INSERT 뿐
	
	int intsertBoard(Board board); //1.xml (mapper에 있는 ID값과 일치시키는 걸 권장)insert id="insertBoard" //2. 파라메터 DAO에 만든 모든 데이터
	
	int updateBoard(Board board);
	
	int deletBoard(int keyNumber);
	
}
