package com.miniSpring.yzy.test.impl;

import com.miniSpring.yzy.test.AService;

/**
 * @author YanZhiyu
 */
public class AServiceImpl implements AService {

    @Override
    public void sayHello() {
        System.out.println("你好，世界！");
    }

}
