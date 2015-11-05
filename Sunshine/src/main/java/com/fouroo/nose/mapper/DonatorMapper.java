package com.fouroo.nose.mapper;

import com.fouroo.nose.entity.Donator;

public interface DonatorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Donator record);

    int insertSelective(Donator record);

    Donator selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Donator record);

    int updateByPrimaryKey(Donator record);
}