package com.care.mvc_ex04;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.member.member;

@Controller
public class QuizController {
	@RequestMapping("/quiz")
	public String login() {
		return "quiz/login";
	}
	
	@RequestMapping("result")
	public String result(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("111") && pw.equals("1234")) {
			return "member03/index";
		}else {
			return "redirect:quiz";
		}
	}
	
	@RequestMapping("member")
	public String memberResult(Model model, member member) {
		model.addAttribute("mb",member);
		return "quiz/result";
	}
	
	
}
