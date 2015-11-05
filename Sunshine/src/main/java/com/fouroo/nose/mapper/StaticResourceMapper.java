package com.fouroo.nose.mapper;

import com.fouroo.nose.entity.StaticResource;

public interface StaticResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StaticResource record);

    int insertSelective(StaticResource record);

    StaticResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StaticResource record);

    int updateByPrimaryKey(StaticResource record);
}