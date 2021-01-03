package com.damon.opensource.myDataSource.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RedisConnectionControllerTest {
    @Resource
    private RedisTemplate<String, Integer> redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void testGetKeys() {
        assertNotNull(stringRedisTemplate.keys("*").toString());
        assertNotNull(redisTemplate.hasKey("test"));
    }
}