package com.platform.admin.service.test;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.platform.admin.api.entity.User;
import com.platform.admin.service.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 吴邪
 * @date 2020/8/11 16:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CrudTest {

    @Autowired
    UserMapper um;

    @Test
    public void test(){
        List<User> users = um.selectList(Wrappers.emptyWrapper());
        System.out.println(users);
    }
}
