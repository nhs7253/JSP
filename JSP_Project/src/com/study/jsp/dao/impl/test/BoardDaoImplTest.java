package com.study.jsp.dao.impl.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.study.jsp.dao.BoardDao;

@Component
public class BoardDaoImplTest {
	@Autowired
	private BoardDao dao;
	
	public BoardDaoImplTest() {
	}

	public BoardDaoImplTest(BoardDao dao) {
		this.dao = dao;
	}
	
	public void Test() {
		System.out.println("최초 조회");
		
		System.out.println(dao.selectBoardAll());
		
		System.out.println(dao.selectBoardCount());
	
		System.out.println("!!!!!!!!!!!!!!!!!!!!!    이상 없음    !!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

	public static void main(String[] args) {
		BoardDaoImplTest daoTest = (BoardDaoImplTest) new ClassPathXmlApplicationContext(
				"com/study/jsp/config/spring/model-context.xml").getBean("boardDaoImplTest");
		daoTest.Test();

	}
}
