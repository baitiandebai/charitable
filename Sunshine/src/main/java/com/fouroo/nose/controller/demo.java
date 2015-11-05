package com.fouroo.nose.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fouroo.nose.service.inter.IContactService;

@Controller
@RequestMapping("/demo")
public class demo {

	@Autowired
	private IContactService iContactService;
	
	@RequestMapping("/lixun")
	public String book(){
		return "index";
	}

}
