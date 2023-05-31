package com.star.agile.assignment.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class TestController {

	@RequestMapping("/index")
	public ModelAndView firstPage() {
		return new ModelAndView("index");
	}

}