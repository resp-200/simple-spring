package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.test.service.HelloService;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/10
 **/
public class SimpleBeanContainerTest {

    @Test
    public void testGetBean(){
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService", new HelloService());
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.sayHello();
    }
}
