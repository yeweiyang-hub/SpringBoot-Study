package com.soft1921.mybatis.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
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
public class Student {
    /**
    * 学生id
    */
    private Integer studentId;

    /**
    * 学生名
    */
    private String studentName;

    /**
    * 籍贯
    */
    private String hometown;

    /**
    * 出生日期
    */
    private LocalDate birthday;

    /**
    * 学生所在班级的id
    */
    private Integer clazzId;

    /**
     * 在多方里声明一方对象
     */
    private Clazz clazz;

    /**
     * 声明课程属性，多对多的关系
     */

    private List<Course> courses;
}