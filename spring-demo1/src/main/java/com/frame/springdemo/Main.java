package com.frame.springdemo;

import com.frame.springdemo.service.TestService;
import com.frame.springdemo.service.impl.TestServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by ln on 2021/7/22
 * file description:
 * last update by {} on {}
 * update description:
 */
public class Main {

    public static void main(String[] args) {
        //常规实现 开发人员手动管理java对象的创建 和调用
        TestService testService = new TestServiceImpl();
        testService.doSomething("testService");

        //创建spring容器 使用配置文件文件方式，获取类路径下的xml文件
        String confg = "bean.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(confg);
        //根据id获取对象
        TestService testService1 = (TestService) ctx.getBean("testService");
        testService1.doSomething("testService1");

        //根据类型获取对象
        TestService testService2 = ctx.getBean(TestService.class);
        testService2.doSomething("testService2");
    }

}
