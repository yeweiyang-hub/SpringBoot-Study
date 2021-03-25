package com.soft1921.mybatis.controller;

import com.soft1921.mybatis.controller.dto.AjaxResponse;
import com.soft1921.mybatis.mapper.ClazzMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author：yeweiyang
 * @date: 2021/3/25-20:57
 */
@RestController
@RequestMapping("api/v1/clazz")
public class ClazzController {

    @Resource
    private ClazzMapper clazzMapper;

    @GetMapping("/{id}")
    public AjaxResponse getByClazzId(@PathVariable Integer id){
        return AjaxResponse.success(clazzMapper.StudentAndTeacher(id));
    }
}
