package com.fouroo.nose.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.fouroo.nose.entity.StaticResource;
import com.fouroo.nose.service.inter.IStaticResourceService;

public class onload implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private IStaticResourceService iStaticResourceService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		if(event.getApplicationContext().getParent() == null){
			
			StaticResource sr = new StaticResource();
			sr.setId(4);
			sr.setPath("asdfas");
			int list = iStaticResourceService.insertSelective(sr);
			
			System.out.print(list);
			
		}
	}

	
}
