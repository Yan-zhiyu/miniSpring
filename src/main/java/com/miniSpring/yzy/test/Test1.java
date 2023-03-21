package com.miniSpring.yzy.test;

import com.miniSpring.yzy.context.ClassPathXmlApplicationContext;
import com.miniSpring.yzy.context.ClassPathXmlApplicationContextOld;
import com.miniSpring.yzy.exception.BeansException;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContextOld ctx = new
                ClassPathXmlApplicationContextOld("beans.xml");
        AService aService = (AService) ctx.getBean("aservice");
        aService.sayHello();

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        try {
            AService aservice = (AService) classPathXmlApplicationContext.getBean("aservice");
            aservice.sayHello();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}
