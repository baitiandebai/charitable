package com.fouroo.nose.service.inter;

import java.util.List;

import com.fouroo.nose.entity.StaticResource;

public interface IStaticResourceService {

	public List<StaticResource> selectAll();
	
	public int insertSelective(StaticResource record);
}
