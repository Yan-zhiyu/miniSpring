package com.miniSpring.yzy.core;

import com.miniSpring.yzy.beans.BeanDefinition;
import org.dom4j.Element;

/**
 * @author YanZhiyu
 */
public class XmlBeanDefinitionReader {
    BeanFactory beanFactory;

    public XmlBeanDefinitionReader(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public void loadBeanDefinition(Resource resource) {
        while (resource.hasNext()) {
            Element element = (Element) resource.next();
            String beanID = element.attributeValue("id");
            String beanClassName = element.attributeValue("class");
            BeanDefinition beanDefinition = BeanDefinition.builder().id(beanID).className(beanClassName).build();
            this.beanFactory.registerBeanDefinition(beanDefinition);
        }
    }

}
