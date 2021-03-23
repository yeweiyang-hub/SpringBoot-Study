package com.soft1921.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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
}