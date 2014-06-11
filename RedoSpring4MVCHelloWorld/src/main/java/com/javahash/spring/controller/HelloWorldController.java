package com.javahash.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.javahash.spring.Model.Contact;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello.do")
	public ModelAndView hello(
			@RequestParam(value = "name", required = false, defaultValue = "dntue World") String name,
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("world", "world");
		return new ModelAndView("helloworld", "command", new Contact());
	}
}
