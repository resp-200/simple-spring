package org.springframework.beans.factory.context.support;

import org.springframework.beans.factory.beans.BeansException;
import org.springframework.beans.factory.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.context.ApplicationContext;
import org.springframework.beans.factory.context.ApplicationContextAware;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/13
 **/
public class ApplicationContextAwareProcessor implements BeanPostProcessor {
    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware){
            ((ApplicationContextAware)bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
