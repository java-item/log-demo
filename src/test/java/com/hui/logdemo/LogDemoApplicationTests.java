package com.hui.logdemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
@Slf4j
class LogDemoApplicationTests {
    @Test
    void contextLoads() throws InterruptedException {
        long l = System.currentTimeMillis();
        Thread.sleep(5000);
        long l1 = System.currentTimeMillis();
        long a = l1 - l;
        System.out.println(a);
    }

}
