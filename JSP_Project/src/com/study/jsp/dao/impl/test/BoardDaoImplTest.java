package com.study.jsp.dao.impl.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.study.jsp.dao.BoardDao;
import com.study.jsp.vo.Board;

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
		
		System.out.println(dao.selectBoardByNumber(1));
		
		System.out.println(dao.intsertBoard(new Board("제목7", "내용7")));
		
		System.out.println(dao.selectBoardByNumber(7));
		
		System.out.println(dao.updateBoard(new Board("제목", "내용")));
		
		System.out.println("update 진입 완료");
		
		System.out.println(dao.deletBoard(1));
	
		System.out.println("!!!!!!!!!!!!!!!!!!!!!    이상 없음    !!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

	public static void main(String[] args) {
		BoardDaoImplTest daoTest = (BoardDaoImplTest) new ClassPathXmlApplicationContext(
				"com/study/jsp/config/spring/model-context.xml").getBean("boardDaoImplTest");
		daoTest.Test();

	}
}
