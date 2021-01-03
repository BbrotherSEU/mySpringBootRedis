package com.damon.opensource.mydatasource.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Predicate;

@Api(tags = "用户相关接口", description = "提供用户相关的 Rest API")
@RestController
@RequestMapping("/stream")
public class StreamServerController {

    @RequestMapping("predicate")
    @ApiOperation("新增用户接口")
    public String predicate(@RequestParam Integer i) {
        Predicate<Integer> atLeast5 = x -> x > 5;
        return String.valueOf(atLeast5.test(i));
    }
}
