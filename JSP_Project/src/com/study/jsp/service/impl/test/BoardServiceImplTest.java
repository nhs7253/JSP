package com.study.jsp.service.impl.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.study.jsp.service.BoardService;

@Component
public class BoardServiceImplTest {
	
	@Autowired
	private BoardService service;
	
	public void Test(){
		System.out.println("서비스 테스트 시작");
		
		
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!    이상 없음    !!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	public static void main(String[] args) {
		
		BoardServiceImplTest serviceTest = 
				(BoardServiceImplTest)new ClassPathXmlApplicationContext("com/study/jsp/config/spring/model-context.xml").getBean("boardServiceImplTest");
		serviceTest.Test();
		
	}
}
