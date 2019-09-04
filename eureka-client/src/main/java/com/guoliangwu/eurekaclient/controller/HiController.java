package com.guoliangwu.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.guoliangwu.eurekaclient.controller
 *
 * @author liangwu
 * @date 2019/09/04
 */
@RestController
@RequestMapping("/")
public class HiController {
    @Value("${server.port}")
    private Integer port;

    @GetMapping("/hi")
    public String hi() {
        return "From eureka-client, port:" + port.toString();
    }
}
