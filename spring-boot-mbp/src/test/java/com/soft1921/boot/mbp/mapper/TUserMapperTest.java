package com.soft1921.boot.mbp.mapper;

import com.soft1921.boot.mbp.entity.TUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author：yeweiyang
 * @date: 2021/3/30-9:16
 */
@SpringBootTest
class TUserMapperTest {
    @Resource
    private TUserMapper TUserMapper;

    @Test
    void delete() {
        int i = TUserMapper.deleteById(5);
        assertEquals(1, i);
    }

    @Test
    void deleteBatch() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        int i = TUserMapper.deleteBatchIds(list);
        assertEquals(3, i);
    }

    @Test
    void updateById() {
        TUser tuser = TUser.builder()
                .age(17)
                .name("qwe")
                .id(4L)
                .build();
        int i = TUserMapper.updateById(tuser);
        assertEquals(1, i);
    }

    @Test
    void insert() {
        TUser tUser = TUser.builder()
                .name("hello")
                .email("hello@163.com")
                .age(18)
                .build();

        int insert = TUserMapper.insert(tUser);
        assertEquals(1, insert);
    }

    @Test
    void deleteByMap() {
        Map<String,Object> map = new HashMap<>();
        map.put("name","qwe");
        map.put("age",17);
        int i = TUserMapper.deleteByMap(map);
        assertEquals(1,i);
    }
}