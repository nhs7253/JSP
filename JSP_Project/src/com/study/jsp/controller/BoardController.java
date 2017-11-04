package com.study.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.jsp.service.BoardService;
import com.study.jsp.vo.Board;


@Controller
public class BoardController {

	@Autowired //주입 받는다.
	private BoardService boardService;

	@RequestMapping("/displayBoard")
	public ModelAndView displayBoard(){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("selectBoard", boardService.getBoardList());
		modelAndView.setViewName("board/boardList");

		return modelAndView;
	}
	
	@RequestMapping("/displaySelectNum")
	public ModelAndView displaySelectNum(@RequestParam(value="displayNum", required=false) int displayNum){
		
		ModelAndView displayNumber = new ModelAndView();
		
		displayNumber.addObject("displayNumber", boardService.getBoardListByNum(displayNum));
		displayNumber.setViewName("board/userView");
		
		return displayNumber;
	}
	
	@RequestMapping("/inserUserData") // request mapping의 value 값을 해당 controller의 호쿨 url로 정함 >> 
	public String inserUserData(@ModelAttribute Board board){ //@modelAttribut << 파라메타값을 다수를 입력받기 위해
		 
		boardService.insertBoardData(board);		
		
		return "redirect:/displayBoard.do";
	}
}
