package com.fouroo.nose.mapper;

import com.fouroo.nose.entity.Smanager;

public interface SmanagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Smanager record);

    int insertSelective(Smanager record);

    Smanager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Smanager record);

    int updateByPrimaryKey(Smanager record);
}