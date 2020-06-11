package com.care.mvc_ex03;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("re/index")
	public String index() {
		return "redirect01/index";
	}
	
	@RequestMapping("re/result")
	public String result(HttpServletRequest request) {
		String userId = request.getParameter("id");
		if(userId.equals("111")) {
			return "redirect:rsOK";
		}
		return "redirect:rsNO";
	}
	
	@RequestMapping("re/rsOK")
	public String resultRsOK() {
		return "redirect01/rsOK";
	}
	@RequestMapping("re/rsNO")
	public String resultRsNO() {
		return "redirect01/rsNO";
	}
	
}
