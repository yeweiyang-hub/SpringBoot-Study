package com.soft1921.mybatis.mapper;

import com.soft1921.mybatis.domain.Clazz;

/**
*
* @author：yeweiyang
* @date: 2021/3/23-21:04
*
*/
public interface ClazzMapper {
    int deleteByPrimaryKey(Integer clazzId);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    Clazz selectByPrimaryKey(Integer clazzId);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}