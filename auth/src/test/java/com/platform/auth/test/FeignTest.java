package com.platform.auth.test;

import com.platform.admin.api.entity.User;
import com.platform.auth.feign.UserFeignClient;
import com.platform.common.core.base.R;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 吴邪
 * @date 2020/8/13 14:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FeignTest {

    @Autowired
    UserFeignClient userFeignClient;

    @Test
    public void test(){
        R<User> admin = userFeignClient.getByUsername("admin");
        System.out.println(admin);
    }
}
