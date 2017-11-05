package com.study.jsp.service.impl.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.study.jsp.service.BoardService;
import com.study.jsp.vo.Board;

@Component
public class BoardServiceImplTest {
	
	@Autowired
	private BoardService service;
	
	public void Test(){
		System.out.println("서비스 테스트 시작");
		
		System.out.println(service.getBoardList());
		
		System.out.println(service.getBoardListByNum(0));
		
		
		
		
		service.updateBoardData(new Board(7, "업데이트테스트", "앙기모찌"));
		System.out.println(service.getBoardListByNum(7));
		
		service.deleteBoardDate(1);// 실제 delete시키고 싶은 키값 int형 
		
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!    이상 없음    !!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	public static void main(String[] args) {
		
		BoardServiceImplTest serviceTest = 
				(BoardServiceImplTest)new ClassPathXmlApplicationContext("com/study/jsp/config/spring/model-context.xml").getBean("boardServiceImplTest");
		serviceTest.Test();
		
	}
}
