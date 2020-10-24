package com.hui.logdemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
@Slf4j
class LogDemoApplicationTests {
    @Test
    void contextLoads() {
        log.trace("这是 trace 类型日志... {}","trace");
        log.debug("这是 debug 类型日志... {}","debug");
        log.info("这是 info 类型日志... {}","info");
        log.warn("这是 warn 类型日志... {}","warn");
        log.error("这是 error 类型日志... {}","error");
    }

}
