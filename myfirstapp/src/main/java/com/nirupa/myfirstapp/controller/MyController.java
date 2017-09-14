package com.nirupa.myfirstapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping(value= {"/","/home"})
	public ModelAndView myHome() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	} 

}
