package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.test.bean.Person;
import org.springframework.test.common.CustomBeanFactoryPostProcessor;
import org.springframework.test.common.CustomBeanPostProcessor;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/13
 **/
public class PostProfessorTest {

    @Test
    public void testBeanFactoryPostProfessor() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        //在所有BeanDefintion加载完成后，但在bean实例化之前，修改BeanDefinition的属性值
        CustomBeanFactoryPostProcessor beanFactoryPostProcessor = new CustomBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
    }

    @Test
    public void testBeanPostProfessor() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        //在所有BeanDefintion加载完成后，但在bean实例化之前，修改BeanDefinition的属性值
        CustomBeanFactoryPostProcessor beanFactoryPostProcessor = new CustomBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);

        //添加beanPostProcessor
        CustomBeanPostProcessor beanPostProcessor = new CustomBeanPostProcessor();
        beanFactory.addBeanPostProcessor(beanPostProcessor);

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
    }
}
