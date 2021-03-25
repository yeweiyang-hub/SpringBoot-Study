package com.soft1921.mybatis.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
*
* @author：yeweiyang
* @date: 2021/3/23-21:04
*
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Clazz {
    /**
    * 班级id
    */
    private Integer clazzId;

    /**
    * 班级名
    */
    private String clazzName;

    /**
    * 管理班级的教师id
    */

    private Integer teacherId;

    /**
     * 班级里的所有学生   一对多的关系
     */
    private List<Student> students;

    /**
     * 班级的老师
     */
    private Teacher teacher;
}