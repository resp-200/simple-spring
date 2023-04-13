package org.springframework.test.common;

import org.springframework.beans.factory.beans.BeansException;
import org.springframework.beans.factory.beans.PropertyValue;
import org.springframework.beans.factory.beans.PropertyValues;
import org.springframework.beans.factory.beans.factory.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/13
 **/
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("custom beanFactory 修改beanDefinition对象的值");
        BeanDefinition person = beanFactory.getBeanDefinition("person");
        PropertyValues propertyValues = person.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name","修改后的name"));
    }
}
