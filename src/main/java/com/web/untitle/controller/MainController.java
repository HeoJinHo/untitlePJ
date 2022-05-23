package com.web.untitle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	
	/**
	 * JSP 호출 Controller 예시
	 * @return
	 */
	@RequestMapping("/main")
	public String getMain() {
		return "/pages/main";
	}

}
