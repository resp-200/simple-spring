package org.springframework.beans.factory.beans.factory.config;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/10
 **/
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
