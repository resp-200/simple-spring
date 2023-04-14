package org.springframework.beans.factory.config;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/10
 **/
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void addSingleton(String beanName, Object singletonObject);
}
