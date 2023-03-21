package com.miniSpring.yzy.core;

import com.miniSpring.yzy.beans.BeanDefinition;
import com.miniSpring.yzy.exception.BeansException;

/**
 * Bean 工厂
 *
 * @author YanZhiyu
 */
public interface BeanFactory {

    /**
     * 核心方法，获取bean对象
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object getBean(String beanName) throws BeansException;


    /**
     * 注册 bean 定义
     *
     * @param beanDefinition
     */
    void registerBeanDefinition(BeanDefinition beanDefinition);

}
