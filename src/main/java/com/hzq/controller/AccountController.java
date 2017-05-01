package com.hzq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hzq on 2017/5/1.
 */
@Controller
public class AccountController {

//	@RequestMapping({"", "/", "/index"})
	public String thymeleafIndex(Model model){
		model.addAttribute("index", "thymeleaf首页");
		return "index";
	}

	@RequestMapping({"", "/", "/index"})
	public String jspIndex(Model model){
		model.addAttribute("index", "jsp首页");
		return "index";
	}

}
