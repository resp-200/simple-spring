package org.springframework.beans.factory.beans.factory.support;

import org.springframework.beans.factory.beans.BeansException;
import org.springframework.beans.factory.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author derekyi
 * @date 2020/11/23
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {

	/**
	 * 简单的bean实例化策略，根据bean的无参构造函数实例化对象
	 *
	 * @param beanDefinition
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
		System.out.println("simple实例化 beanName="+beanDefinition.getBeanClass().getSimpleName());
		Class beanClass = beanDefinition.getBeanClass();
		try {
			Constructor constructor = beanClass.getDeclaredConstructor();
			return constructor.newInstance();
		} catch (Exception e) {
			throw new BeansException("Failed to instantiate [" + beanClass.getName() + "]", e);
		}
	}
}
