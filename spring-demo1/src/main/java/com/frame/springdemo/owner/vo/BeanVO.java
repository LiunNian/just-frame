package com.frame.springdemo.owner.vo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * create by ln on 2021/7/22
 * file description:
 * last update by {} on {}
 * update description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeanVO implements Serializable {

    private String id;
    
    private Class clazz;

}
