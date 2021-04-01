package com.soft1921.boot.mbp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TUser)实体类
 *
 * @author makejava
 * @since 2021-03-30 09:12:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TUser implements Serializable {
    private static final long serialVersionUID = -63808632785855175L;
    /**
     * 主键
     */
    private Long id;
    /**x
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 邮箱
     */
    private String email;



}
