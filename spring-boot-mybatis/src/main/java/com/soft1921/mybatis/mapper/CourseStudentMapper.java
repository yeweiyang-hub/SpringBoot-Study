package com.soft1921.mybatis.mapper;

import com.soft1921.mybatis.domain.CourseStudent;

/**
*
* @author：yeweiyang
* @date: 2021/3/23-21:04
*
*/
public interface CourseStudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseStudent record);

    int insertSelective(CourseStudent record);

    CourseStudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseStudent record);

    int updateByPrimaryKey(CourseStudent record);
}