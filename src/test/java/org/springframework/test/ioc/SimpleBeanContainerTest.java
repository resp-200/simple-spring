package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.beans.PropertyValue;
import org.springframework.beans.factory.beans.PropertyValues;
import org.springframework.beans.factory.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.beans.factory.config.BeanReference;
import org.springframework.beans.factory.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.test.bean.Car;
import org.springframework.test.bean.Person;
import org.springframework.test.service.HelloService;

import static org.assertj.core.api.Assertions.assertThat;

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

    @Test
    public void testPropertyBean(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //注册Car实例
        PropertyValues propertyValuesForCar = new PropertyValues();
        propertyValuesForCar.addPropertyValue(new PropertyValue("name", "兰博基尼"));
        BeanDefinition carBeanDefinition = new BeanDefinition(Car.class, propertyValuesForCar);
        beanFactory.registerBeanDefinition("car", carBeanDefinition);

        //注册Person实例
        PropertyValues propertyValuesForPerson = new PropertyValues();
        propertyValuesForPerson.addPropertyValue(new PropertyValue("name", "张三"));
        propertyValuesForPerson.addPropertyValue(new PropertyValue("age", 18));
        //Person实例依赖Car实例
        propertyValuesForPerson.addPropertyValue(new PropertyValue("car", new BeanReference("car")));
        BeanDefinition beanDefinition = new BeanDefinition(Person.class, propertyValuesForPerson);
        beanFactory.registerBeanDefinition("person", beanDefinition);

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
    }
}
