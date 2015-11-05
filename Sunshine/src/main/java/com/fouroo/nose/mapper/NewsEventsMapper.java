package com.fouroo.nose.mapper;

import com.fouroo.nose.entity.NewsEvents;

public interface NewsEventsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsEvents record);

    int insertSelective(NewsEvents record);

    NewsEvents selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsEvents record);

    int updateByPrimaryKeyWithBLOBs(NewsEvents record);

    int updateByPrimaryKey(NewsEvents record);
}