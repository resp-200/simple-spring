package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.bean.Car;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/17
 **/
public class PackageScanTest {

    @Test
    public void testPackageScan(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:package-scan.xml");

        Car car = applicationContext.getBean("car", Car.class);
        System.out.println(car);
    }
}
