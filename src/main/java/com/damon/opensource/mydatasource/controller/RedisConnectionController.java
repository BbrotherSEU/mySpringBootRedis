package com.damon.opensource.mydatasource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/redis")
public class RedisConnectionController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("getKeys")
    public String getKeys() {
        System.out.println(redisTemplate.keys("*"));
        return stringRedisTemplate.keys("*").toString();
    }
}
