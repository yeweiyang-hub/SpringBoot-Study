package com.soft1921.mybatis.mapper;

import com.soft1921.mybatis.domain.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author：yeweiyang
 * @date: 2021/3/23-20:04
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
@Slf4j
class TeacherMapperTest {
    @Resource
    private TeacherMapper teacherMapper;
    @Test
    void selectAll() {
        List<Teacher> teachers = teacherMapper.selectAll();
        log.info("Teachers:" + teachers);
    }

    @Test
    void findAll() {
        List<Teacher> teachers = teacherMapper.findAll();
        log.info("teachers:" + teachers);
    }

    @Test
    void insertTeacher() {
        Teacher teacher = Teacher.builder()
                .teacherName("测试")
                .clazzId(2)
                .build();

        teacherMapper.insertTeacher(teacher);
    }

    @Test
    void selectTeachetOneByOne() {
        Teacher o = teacherMapper.selectTeachetOneByOne(1);
        log.info("教师1的信息："+ o.getTeacherName()+","+o.getClazz().getClazzId()+","+o.getClazz().getClazzName());
        assertEquals("clazz1", o.getClazz().getClazzName());
    }
}