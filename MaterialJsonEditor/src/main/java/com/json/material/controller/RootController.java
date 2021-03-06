package com.json.material.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RootController {

	@RequestMapping(value = "/showJson", method = RequestMethod.POST)
	public ModelAndView showJson(String json) {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		model.addObject("data", json);
		return model;
	}

}
