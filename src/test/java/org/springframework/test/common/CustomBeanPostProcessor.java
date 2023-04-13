package org.springframework.test.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.test.bean.Car;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/13
 **/
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean postProcess before beanName="+beanName);
        //换兰博基尼
        if ("car".equals(beanName)) {
            ((Car) bean).setName("小破车");
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean postProcess after beanName="+beanName);
        return bean;
    }
}
