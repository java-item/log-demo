package com.hui.logdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@Slf4j
public class LogController {
    @RequestMapping("/log")
    public String test(){
        String text = "日志内容~~~";
        // 重复40遍字符串
        String join = String.join("", Collections.nCopies(20, text));
        long l = System.currentTimeMillis();
        log.trace("这是 trace 类型日志... {}",join);
        log.debug("这是 debug 类型日志... {}",join);
        log.info("这是 info 类型日志... {}",join);
        log.warn("这是 warn 类型日志... {}",join);
        log.error("这是 error 类型日志... {}",join);
        long end = System.currentTimeMillis();
        long use = end-l;
        return "日志测试使用: " + use + "ms";
    }
}
