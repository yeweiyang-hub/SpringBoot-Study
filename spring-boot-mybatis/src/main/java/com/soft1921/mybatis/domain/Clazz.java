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
}