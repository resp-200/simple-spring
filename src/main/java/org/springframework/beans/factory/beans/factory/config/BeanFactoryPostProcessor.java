package org.springframework.beans.factory.beans.factory.config;


import org.springframework.beans.factory.beans.BeansException;
import org.springframework.beans.factory.beans.factory.ConfigurableListableBeanFactory;

/**
 * 允许自定义修改BeanDefinition的属性值，可实现占位符、converter
 *
 * @author derekyi
 * @date 2020/11/28
 */
@FunctionalInterface
public interface BeanFactoryPostProcessor {

	/**
	 * 在所有BeanDefintion加载完成后，但在bean实例化之前，提供修改BeanDefinition属性值的机制
	 *
	 * @param beanFactory
	 * @throws BeansException
	 */
	void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
