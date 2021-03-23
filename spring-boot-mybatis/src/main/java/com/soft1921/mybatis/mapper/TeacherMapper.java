package com.soft1921.mybatis.mapper;

import com.soft1921.mybatis.domain.Teacher;import org.apache.ibatis.annotations.Select;import java.util.List;

/**
 * @author：yeweiyang
 * @date: 2021/3/23-21:06
 */
public interface TeacherMapper {
    int deleteByPrimaryKey(Integer teacherId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer teacherId);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    /**
     * 返回所有的Teacher,使用注解方式实现
     *
     * @return
     */
    @Select("SELECT * FROM t_teacher ")
    List<Teacher> selectAll();

    /**
     * 返回所有的Teacher,用xml方式实现
     *
     * @return
     */
    List<Teacher> findAll();

    /**
     * 添加一条教师信息
     *
     * @param teacher
     */
    void insertTeacher(Teacher teacher);
}