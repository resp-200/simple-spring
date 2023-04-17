package org.springframework.beans.factory.config;

import org.springframework.beans.BeansException;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/17
 **/
public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor{

    /**
     * 在bean实例化之前执行
     *
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;
}
