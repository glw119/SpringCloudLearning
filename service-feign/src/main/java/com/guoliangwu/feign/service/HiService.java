package com.guoliangwu.feign.service;

import com.guoliangwu.feign.service.impl.HiServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * com.guoliangwu.feign.service
 *
 * @author liangwu
 * @date 2019/09/04
 */
@FeignClient(value = "service-client", fallback = HiServiceHystric.class)
public interface HiService {
    @GetMapping("/hi")
    String sayingHiFromEurekaClient();
}
