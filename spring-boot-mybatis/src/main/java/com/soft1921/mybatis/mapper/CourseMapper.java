package com.soft1921.mybatis.mapper;

import com.soft1921.mybatis.domain.Course;

/**
*
* @author：yeweiyang
* @date: 2021/3/23-21:04
*
*/
public interface CourseMapper {
    int deleteByPrimaryKey(Integer courseId);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer courseId);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}