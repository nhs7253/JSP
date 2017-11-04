package com.study.jsp.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.study.jsp.dao.BoardDao;
import com.study.jsp.vo.Board;

@Repository
public class BoardDaoImpl implements BoardDao{

	@Autowired
	private SqlSessionTemplate session;
	
	private String namespace="com.study.jsp.config.mybatis.mapper.BoardMapper.";
	
	@Override
	public List<Board> selectBoardAll() {
		return session.selectList(namespace+"selectBoardAll");
	}

	@Override
	public int selectBoardCount() {
		return session.selectOne(namespace+"selectBoardCount");
	}

	@Override
	public Board selectBoardByNumber(int number) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+"selectBoardByNumber", number);
	}

	@Override
	public int intsertBoard(Board board) {
		return session.insert(namespace+"insertBoard", board);
	}



}
