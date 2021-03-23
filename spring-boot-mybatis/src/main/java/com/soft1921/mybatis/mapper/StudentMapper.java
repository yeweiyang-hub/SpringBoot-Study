package com.soft1921.mybatis.mapper;

import com.soft1921.mybatis.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
*
* @author：yeweiyang
* @date: 2021/3/23-21:04
*
*/
public interface StudentMapper {
    int deleteByPrimaryKey(Integer studentId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    /**
     * 批量新增学生
     *
     * @param students 学生集合
     * @return int
     */
    int batchInsert(@Param("students") List<Student> students);

    /**
     * 批量删除
     *
     * @param idList 待删记录id集合
     * @return int
     */
    int batchDelete(@Param("idList") List<Integer> idList);

    /**
     * 批量修改
     *
     * @param students 学生集合
     * @return int
     */
    int batchUpdate(@Param("students") List<Student> students);

    /**
     * 按条件单表查询，结合动态SQL
     *
     * @param student 参数对象
     * @return List<Student>
     */
    List<Student> selectByDynamicSql(Student student);

}