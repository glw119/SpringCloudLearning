package com.guoliangwu.feign.service.impl;

import com.guoliangwu.feign.service.HiService;
import org.springframework.stereotype.Component;

/**
 * com.guoliangwu.feign.service.impl
 *
 * @author liangwu
 * @date 2019/09/04
 */
@Component
public class HiServiceHystric implements HiService {
    @Override
    public String sayingHiFromEurekaClient() {
        return "Service client error";
    }
}
