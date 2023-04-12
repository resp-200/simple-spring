package org.springframework.beans.factory.beans.factory.support;

import org.springframework.beans.factory.beans.factory.BeanFactory;
import org.springframework.beans.factory.beans.BeansException;
import org.springframework.beans.factory.beans.factory.config.BeanDefinition;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/10
 **/
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
