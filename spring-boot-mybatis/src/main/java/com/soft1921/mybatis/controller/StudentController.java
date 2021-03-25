package com.soft1921.mybatis.controller;

import com.soft1921.mybatis.controller.dto.AjaxResponse;
import com.soft1921.mybatis.domain.Student;
import com.soft1921.mybatis.mapper.StudentMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author：yeweiyang
 * @date: 2021/3/25-16:52
 */
@RestController
@RequestMapping(value = "api/v1/student")
public class StudentController {
    @Resource
    private StudentMapper studentMapper;

    @GetMapping("/{id}")
    public AjaxResponse getByStudentId(@PathVariable("id") Integer id) {
        Student student = studentMapper.clazzAndCourse(id);
        return AjaxResponse.success(student);
    }

}
