package com.web.untitle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UntitleController {

	
	/**
	 * RestController SpringMVC2 예시
	 * REST API 예시 (PostMan -> localhost:8080/rest)
	 * @return
	 */
	@RequestMapping("/rest")
	public @ResponseBody String test() {
		return "sdasdasssasdsasssss";
	}
	
}
