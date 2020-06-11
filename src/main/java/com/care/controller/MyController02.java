package com.care.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController02 {
	@RequestMapping("member02/index")
	public String memberIndex() {
		return "member02/index";
	}
	
	@RequestMapping(value="member02/result",method=RequestMethod.GET)//인자가 두개이상 들어가면 value를 적용한다
	public String memberResult(HttpServletRequest request, Model model) {
		model.addAttribute("name",request.getParameter("name"));
		model.addAttribute("age",request.getParameter("age"));
		return "member02/result";
	}
	
	@RequestMapping(value="member02/result",method=RequestMethod.POST)//인자가 두개이상 들어가면 value를 적용한다
	public String memberResultPOST(@RequestParam("name") String name,
			@RequestParam("age") String age, Model model) {
		model.addAttribute("name",name + "post");
		model.addAttribute("age",age + "post");
		return "member02/result";
	}
	
	
}
