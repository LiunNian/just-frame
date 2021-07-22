package com.frame.springdemo.owner.service;

import com.frame.springdemo.owner.vo.BeanVO;

/**
 * create by ln on 2021/7/22
 * file description:
 * last update by {} on {}
 * update description:
 */
public interface MyApplicationContextService {

    Object findBean(String id);

    Object findBean(Class<?> type);

    void saveBean(BeanVO beanVO);

}
