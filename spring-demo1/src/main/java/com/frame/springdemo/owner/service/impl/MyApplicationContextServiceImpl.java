package com.frame.springdemo.owner.service.impl;
import com.frame.springdemo.owner.entity.BeanDO;
import com.frame.springdemo.owner.service.MyApplicationContextService;
import com.frame.springdemo.owner.vo.BeanVO;
import org.springframework.beans.BeanUtils;
import java.util.HashMap;
import java.util.Map;

/**
 * create by ln on 2021/7/22
 * file description:
 * last update by {} on {}
 * update description:
 */
public class MyApplicationContextServiceImpl implements MyApplicationContextService {

    /** java对象map集合 **/
    static Map<String, BeanDO> idMap = new HashMap<>();
    static Map<Class<?>, BeanDO> clazzMap = new HashMap<>();

    @Override
    public Object findBean(String id) {
        try {
            Object obj = idMap.get(id).getClazz().newInstance();
            return obj;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object findBean(Class<?> type) {
        try {
            for (Map.Entry<Class<?>, BeanDO> entry : clazzMap.entrySet()) {
                if (entry.getKey().asSubclass(type)!=null){
                    Object obj =  entry.getValue().getClazz().newInstance();
                    return obj;
                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void saveBean(BeanVO beanVO) {
        BeanDO beanDO = new BeanDO();
        BeanUtils.copyProperties(beanVO,beanDO);
        idMap.put(beanVO.getId(),beanDO);
        clazzMap.put(beanVO.getClazz(),beanDO);
    }
}
