package com.soft1921.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class Course {
    /**
    * 课程id
    */
    private Integer courseId;

    /**
    * 课程名称
    */
    private String courseName;
}