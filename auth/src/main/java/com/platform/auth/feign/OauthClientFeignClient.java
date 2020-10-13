package com.platform.auth.feign;

import com.platform.admin.api.entity.OauthClient;
import com.platform.common.core.base.R;
import com.platform.common.core.constant.FeignClientPublic;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 吴邪
 * @date 2020/8/12 14:52
 */
@FeignClient(name = FeignClientPublic.SERVICE_ADMIN,contextId = "OauthClientFeignClient",path = FeignClientPublic.URL_ADMIN_OAUTHCLIENT)
public interface OauthClientFeignClient {

    /**
     * 通过clientId获取OauthClient信息
     * @param clientId
     * @return
     */
    @GetMapping("/byClientId")
    R<OauthClient> getByClientId(@RequestParam("clientId") String clientId);
}
