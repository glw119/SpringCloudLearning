package com.guoliangwu.feign.controller;

import com.guoliangwu.feign.service.HiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * com.guoliangwu.feign.controller
 *
 * @author liangwu
 * @date 2019/09/04
 */
@RestController
public class HiController {
    @Resource
    private HiService hiService;

    @GetMapping("/hi")
    String sayHi(){
        return hiService.sayingHiFromEurekaClient();
    }
}
