package com.fouroo.nose.mapper;

import com.fouroo.nose.entity.SocialPolicy;

public interface SocialPolicyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SocialPolicy record);

    int insertSelective(SocialPolicy record);

    SocialPolicy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SocialPolicy record);

    int updateByPrimaryKeyWithBLOBs(SocialPolicy record);

    int updateByPrimaryKey(SocialPolicy record);
}