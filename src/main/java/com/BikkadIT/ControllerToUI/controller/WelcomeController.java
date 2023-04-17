//1)Sending data from Controller to UI
package com.BikkadIT.ControllerToUI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/Welcome")
	public ModelAndView wecomeMsg() {
		
		String msg= "Wellcome to Java Devlopment Envorment";
		ModelAndView mav = new ModelAndView();
		mav.addObject("MESSAGE",msg);
		mav.setViewName("wel");
		return mav;
		
	}
}
