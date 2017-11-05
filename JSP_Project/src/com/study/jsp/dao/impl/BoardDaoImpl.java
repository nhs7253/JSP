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

	@Override
	public int updateBoard(Board board) {
		// TODO Auto-generated method stub
		return session.update(namespace+"updateBoard",board);
	}

	@Override
	public int deletBoard(int keyNumber) {
		// TODO Auto-generated method stub
		return session.delete(namespace+"deletBoard", keyNumber);//mapper에 등록 한 아이디값과 경로(statement),받을값(파라메터지정-인터페이스 키값)
	}

	



}
