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
	
	
	
}
