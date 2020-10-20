package com.hui.logdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogController {

    @RequestMapping("/log")
    public String test(){
        log.trace("这是 trace 类型日志... {}","trace");
        log.debug("这是 debug 类型日志... {}","debug");
        log.info("这是 info 类型日志... {}","info");
        log.warn("这是 warn 类型日志... {}","warn");
        log.error("这是 error 类型日志... {}","error");
        return "日志测试使用";
    }
}
