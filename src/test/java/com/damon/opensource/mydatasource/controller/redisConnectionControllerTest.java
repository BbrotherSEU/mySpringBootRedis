package com.damon.opensource.mydatasource.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

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
        System.out.println(redisTemplate.getValueSerializer());
        System.out.println(stringRedisTemplate.keys("*"));
        System.out.println(redisTemplate.keys("*"));
        assertNotNull(stringRedisTemplate.keys("*").toString());
        assertNotNull(redisTemplate.hasKey("test"));
    }
}