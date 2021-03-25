package com.soft1921.mybatis.mapper;

import com.soft1921.mybatis.domain.Clazz;

/**
*
* @author：yeweiyang
* @date: 2021/3/23-21:04
*
*/
public interface ClazzMapper {
    /**
     *  根据班级id查询
     * @param clazzid
     * @return
     */
    Clazz getClazzOneToMany(Integer clazzid);

    Clazz StudentAndTeacher(Integer clazzid);
}