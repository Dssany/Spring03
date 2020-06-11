package com.care.mvc_ex03;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {

	@RequestMapping("re/index")
	public String index() {
		return "redirect01/index";
	}
	
	@RequestMapping("re/result")
	public String result(Model model,HttpServletRequest request,RedirectAttributes ra,HttpSession session) {
		String userId = request.getParameter("id");
		if(userId.equals("111")) {
			//model.addAttribute("login","축하합니다!");
			ra.addFlashAttribute("login","축하합니다!");
			session.setAttribute("se","세션값입니다");
			HttpSession s = request.getSession();
			s.setAttribute("s", "새로운 세션입니다");
			return "redirect:rsOK";
		}
		return "redirect:rsNO";
	}
	
	@RequestMapping("re/rsOK")
	public String resultRsOK(Model model) {
		model.addAttribute("db","db에서 개인정보를 가져왔습니다");
		return "redirect01/rsOK";
	}
	@RequestMapping("re/rsNO")
	public String resultRsNO() {
		return "redirect01/rsNO";
	}
	
}
