package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.test.service.HelloService;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/10
 **/
public class SimpleBeanContainerTest {

    @Test
    public void testGetBean(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanFactory.registerBeanDefinition("helloService",beanDefinition);

        HelloService helloService = (HelloService)beanFactory.getBean("helloService");
        helloService.sayHello();
    }
}
