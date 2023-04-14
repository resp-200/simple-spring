package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.event.CustomEvent;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/14
 **/
public class EventTest {

    @Test
    public void ApplicationTest(){
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("classpath:event-and-event-listener.xml");

        applicationContext.publishEvent(new CustomEvent(applicationContext));

        applicationContext.close();
    }
}
