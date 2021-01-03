package com.damon.opensource.mydatasource.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private RedisTemplate<String, String> redisTemplate;
    private static final Logger logger = LoggerFactory.getLogger(RedisConnectionController.class);

    @RequestMapping("getKeys")
    public String getKeys() {
        logger.info("redisTemplate output is: " + redisTemplate.keys("*").toString());
        return stringRedisTemplate.keys("*").toString();
    }
}
