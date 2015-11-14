package com.fouroo.nose.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fouroo.nose.entity.StaticResource;
import com.fouroo.nose.mapper.StaticResourceMapper;
import com.fouroo.nose.service.inter.IStaticResourceService;

@Service
public class StaticResourceServiceImpl implements IStaticResourceService{

	@Autowired
	private StaticResourceMapper staticResourceMapper;
	
	@Override
	public List<StaticResource> selectAll() {
		
		return staticResourceMapper.selectAll();
	}

	@Override
	public int insertSelective(StaticResource record) {
		// TODO Auto-generated method stub
		return staticResourceMapper.insertSelective(record);
	}


}
