package org.springframework.beans.factory.beans.factory.support;

import org.springframework.beans.factory.beans.BeansException;
import org.springframework.beans.factory.beans.factory.config.BeanDefinition;

/** 实例化策略
 * @author: Zhang hao yu
 * @date: 2023/4/12
 **/
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
