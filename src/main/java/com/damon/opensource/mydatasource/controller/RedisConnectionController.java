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
        if (redisTemplate.keys("*").size() > 0) {
            logger.info(String.format("redisTemplate output is: %s", redisTemplate.keys("*").size()));
        } else {
            logger.info("no output for redisTemplate");
        }
        return stringRedisTemplate.keys("*").toString();
    }
}
