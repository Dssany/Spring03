package com.care.mvc_ex03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("re/index")
	public String index() {
		return "redirect01/index";
	}
	
}
