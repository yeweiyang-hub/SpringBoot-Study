package com.soft1921.mybatis.mapper;

import com.soft1921.mybatis.domain.Clazz;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author：yeweiyang
 * @date: 2021/3/25-15:02
 */

@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
class ClazzMapperTest {

    @Resource
    private ClazzMapper clazzMapper;

    @Test
    void getClazzOneToMany() {
        Clazz clazzOneToMany = clazzMapper.getClazzOneToMany(1);
        log.info("classId:" + clazzOneToMany.getClazzId() + "calssname:" + clazzOneToMany.getClazzName());
        clazzOneToMany.getStudents().forEach(student -> {
            log.info("name:" + student.getStudentName() + ",hometown:" + student.getHometown());
        });
        assertEquals(15, clazzOneToMany.getStudents().size());
    }

    @Test
    void studentAndTeacher() {
        Clazz clazz = clazzMapper.StudentAndTeacher(2);
        log.info("calzzid:" + clazz.getClazzId() + ";clazzName:" + clazz.getClazzName()
                + ";teacherName:" + clazz.getTeacher().getTeacherName());
        clazz.getStudents().forEach(student -> {
            log.info("stundetId:"+student.getStudentId()+";studentName:"+student.getStudentName());
        });
        assertEquals("wang",clazz.getTeacher().getTeacherName());
        assertEquals(4,clazz.getStudents().size());


    }
}