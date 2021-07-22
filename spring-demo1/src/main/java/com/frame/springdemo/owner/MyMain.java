package com.frame.springdemo.owner;
import com.frame.springdemo.owner.service.MyApplicationContextService;
import com.frame.springdemo.owner.service.impl.MyApplicationContextServiceImpl;
import com.frame.springdemo.owner.vo.BeanVO;
import com.frame.springdemo.service.TestService;
import com.frame.springdemo.service.impl.TestServiceImpl;

/**
 * create by ln on 2021/7/22
 * file description:
 * last update by {} on {}
 * update description:
 */
public class MyMain {

    public static void main(String[] args) {
        MyApplicationContextService mctx = new MyApplicationContextServiceImpl();
        mctx.saveBean(new BeanVO("testService", TestServiceImpl.class));

        TestService testService = (TestService) mctx.findBean("testService");
        testService.doSomething("MyApplicationContext：testService");

        TestService testService1 = (TestService) mctx.findBean(TestService.class);
        testService1.doSomething("MyApplicationContext：testService1");
    }


}
