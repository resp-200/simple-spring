package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.bean.Person;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/13
 **/
public class BeanScopeTest {

    @Test
    public void scopeTest(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Person person = (Person)applicationContext.getBean("person");
        Person person2 = (Person)applicationContext.getBean("person");
        System.out.println(person == person2);
    }
}
