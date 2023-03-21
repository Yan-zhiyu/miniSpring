package com.miniSpring.yzy.context;

import com.miniSpring.yzy.beans.BeanDefinition;
import com.miniSpring.yzy.core.BeanFactory;
import com.miniSpring.yzy.core.XmlBeanDefinitionReader;
import com.miniSpring.yzy.core.impl.ClassPathXmlResource;
import com.miniSpring.yzy.core.impl.SimpleBeanFactory;
import com.miniSpring.yzy.exception.BeansException;

/**
 * 负责整合容器的启动过程，读外部配置，解析Bean定义，创建BeanFactory
 *
 * @author YanZhiyu
 */
public class ClassPathXmlApplicationContext {

    BeanFactory beanFactory;

    public ClassPathXmlApplicationContext(String fileName) {
        ClassPathXmlResource resource = new ClassPathXmlResource(fileName);
        BeanFactory beanFactory = new SimpleBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinition(resource);
        this.beanFactory = beanFactory;
    }

    public Object getBean(String beanName) throws BeansException {
        return this.beanFactory.getBean(beanName);
    }

    public void registerBeanDefinition(BeanDefinition beanDefinition) {
        this.beanFactory.registerBeanDefinition(beanDefinition);
    }

}
