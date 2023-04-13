package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.bean.Person;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/13
 **/
public class ApplicationContextTest {

    @Test
    public void applicationXmlTest(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

        applicationContext.registerShutdownHook();
    }
}
