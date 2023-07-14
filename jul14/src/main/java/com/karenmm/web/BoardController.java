package com.karenmm.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	
	@Autowired 
	private BoardService service;
	
	//1. board리스트 보는 화면 =board.jsp
	//2. detail 상세보기 화면 = detail.jsp
	
	@GetMapping("/board")
	public String board(Model model)	{
		
		model.addAttribute("name", "1234"); //name , value 맵 처럼 키 밸류 느낌
		
		List<BoardDTO> list = service.boardList() ;
		
		//!list.isEmpty() ==비어있지 않다면
		if(list.size()>1) {
		model.addAttribute("list", list);
		return "board";
		}else {
			return "redirect:/"; //리다이렉트 : 다시 컨트롤러 지나갑니다. / 여기로 이동
		}
	}
	
	
	@GetMapping("/detail")
	public String detail(HttpServletRequest request) {
	String bno = request.getParameter("bno");
	System.out.println(bno);
	
	//int no = Integer.parseInt(bno);
	
	
	try {
		int no = Integer.parseInt(bno);
		System.out.println("숫자입니다");
	} catch (Exception e) {
		System.out.println("숫자가 아닙니다");
	}
	
	
	
	//for(int i=0; i < bno.length(); i++) {
	//System.out.println(Character.isDigit(bno.charAt(i)));
	//}
		
		
		return "detail";
		
	}

}
