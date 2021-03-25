package com.soft1921.mybatis.mapper;

import com.soft1921.mybatis.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author：yeweiyang
 * @date: 2021/3/23-21:37
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
@Slf4j
class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;


    @Test
    void updateByPrimaryKey() {
    }

    @Test
    void batchInsert() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = Student.builder()
                    .studentId(2000 + i)
                    .clazzId(1)
                    .studentName("测试学生" + i)
                    .hometown("测试城市")
                    .birthday(LocalDate.of(2000, 11, 11))
                    .build();
            students.add(student);
        }
        int n = studentMapper.batchInsert(students);
//        log.info();
//        assertEquals(10, n);
    }

    @Test
    void batchDelete() {
        List<Integer> idList = new ArrayList<>();
        idList.add(2001);
        idList.add(2002);
        idList.add(2003);
        int n = studentMapper.batchDelete(idList);
//        assertEquals(3, n);
    }

    @Test
    void batchUpdate() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = Student.builder()
                    .studentId(2000 + i)
                    .clazzId(1)
                    .studentName("新名字" + i)
                    .build();
            students.add(student);
        }
        int n = studentMapper.batchUpdate(students);
//        assertEquals(1, n);
    }

    @Test
    void selectByDynamicSql() {
        Student student = Student.builder().hometown("江").build();
        List<Student> students = studentMapper.selectByDynamicSql(student);
    log.info("家乡是\"江\"开头的学生"+students);
    }

    @Test
    void getStudentManyToOne() {
        Student studentManyToOne = studentMapper.getStudentManyToOne(1001);
        log.info("studentName:"+studentManyToOne.getStudentName()+",studentId:"+studentManyToOne.getStudentId());
        log.info("clazzid:"+studentManyToOne.getClazz().getClazzId()+";clazzName:"+studentManyToOne.getClazz().getClazzName());
        assertEquals("clazz1",studentManyToOne.getClazz().getClazzName());

    }

    @Test
    void clazzAndCourse() {
        Student student = studentMapper.clazzAndCourse(1001);
        log.info("studentId:"+student.getStudentId()+";studentName:"+student.getStudentName());
        log.info("clazzId:"+student.getClazz().getClazzId());
            student.getCourses().forEach(course -> {
                log.info("courseId:"+course.getCourseId()+";courseName:"+course.getCourseName());
            });

        assertEquals(2,student.getCourses().size());
        assertEquals(1,student.getClazz().getClazzId());

    }
}