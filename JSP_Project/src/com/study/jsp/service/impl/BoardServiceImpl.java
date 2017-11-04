package com.study.jsp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.jsp.dao.BoardDao;
import com.study.jsp.service.BoardService;
import com.study.jsp.vo.Board;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao boardDao;

	@Override
	public List<Board> getBoardList() {
		// TODO Auto-generated method stub
		
		
	/*	int num = 1 + 1 ;
		return num;
		
		return 1 + 1;
	*/
		
		return boardDao.selectBoardAll();
	}
	
	@Override
	public Board getBoardListByNum(int selectNum) {
		// TODO Auto-generated method stub
	
		
		return boardDao.selectBoardByNumber(selectNum);
	}

	@Override
	public void insertBoardData(Board insertdata) { /// ()파라메터는 서비스 인터페이스에서 설정한 변수 이름으로 설정
		// TODO Auto-generated method stub
		
		boardDao.intsertBoard(insertdata); // 컨트롤러 에서 넘어오는 파라메터를 Dao로 담아줌
	}
	
	
	
}
