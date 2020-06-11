package com.care.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("index01")
	public String memberIndex(Model model) {
		model.addAttribute("name","홍길동!!!");
		return "member/index";
	}
	
	@RequestMapping(value="logout")
	public String memberlogout() {
		
		return "member/logout";
	}
	
	@RequestMapping("login")
	public ModelAndView memberLogin() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("login","로그인 페이지 입니다");
		mv.setViewName("member/login");
		return mv;
	}
	
	
}
