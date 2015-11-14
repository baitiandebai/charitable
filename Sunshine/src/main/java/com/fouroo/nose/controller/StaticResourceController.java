package com.fouroo.nose.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/static")
public class StaticResourceController {

	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	@RequestMapping(value="/image")
	@ResponseBody
	public String getImage(){
		
		return "wodetian";
	}
}
