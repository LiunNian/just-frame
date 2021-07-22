package com.frame.springdemo.service.impl;

import com.frame.springdemo.service.TestService;

/**
 * create by ln on 2021/7/22
 * file description:
 * last update by {} on {}
 * update description:
 */
public class TestServiceImpl implements TestService {

    @Override
    public void doSomething(String name) {
      System.out.println(name +" 执行业务代码 doSomething!!!");
    }

    @Override
    public void doNot(String name) {
        System.out.println(name+" 执行业务代码 doNot!!!");
    }
}
