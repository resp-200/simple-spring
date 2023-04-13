package org.springframework.test.service;

import org.springframework.beans.factory.beans.BeansException;
import org.springframework.beans.factory.beans.factory.BeanFactory;
import org.springframework.beans.factory.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.context.ApplicationContext;
import org.springframework.beans.factory.context.ApplicationContextAware;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/10
 **/
public class HelloService implements BeanFactoryAware, ApplicationContextAware {
    public String sayHello() {
        System.out.println("hello");
        return "hello";
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("beanFactory设置成功");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext设置成功");
    }
}
