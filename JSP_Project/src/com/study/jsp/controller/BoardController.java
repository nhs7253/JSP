package com.study.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.study.jsp.service.BoardService;

@Controller
public class BoardController {

	@Autowired //주입 받는다.
	private BoardService boardService;
	
	public ModelAndView displayBoard()
	{
		
		boardService.getBoardList();
		
		return null;
	}
}
