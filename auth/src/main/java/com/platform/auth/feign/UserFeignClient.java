package com.platform.auth.feign;

import com.platform.admin.api.entity.User;
import com.platform.common.core.base.R;
import com.platform.common.core.constant.FeignClientPublic;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 吴邪
 * @date 2020/8/12 14:52
 */
@FeignClient(name = FeignClientPublic.SERVICE_ADMIN,contextId = "UserFeignClient",path = FeignClientPublic.URL_ADMIN_USER)
public interface UserFeignClient {

    /**
     * 通过username获取User信息
     * @param username
     * @return
     */
    @GetMapping("/byUsername")
    R<User> getByUsername(@RequestParam("username") String username);
}
