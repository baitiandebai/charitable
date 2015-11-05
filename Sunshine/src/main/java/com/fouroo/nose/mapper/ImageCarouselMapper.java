package com.fouroo.nose.mapper;

import com.fouroo.nose.entity.ImageCarousel;

public interface ImageCarouselMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImageCarousel record);

    int insertSelective(ImageCarousel record);

    ImageCarousel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ImageCarousel record);

    int updateByPrimaryKeyWithBLOBs(ImageCarousel record);

    int updateByPrimaryKey(ImageCarousel record);
}