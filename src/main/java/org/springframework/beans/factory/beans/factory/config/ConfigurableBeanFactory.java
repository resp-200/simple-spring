package org.springframework.beans.factory.beans.factory.config;


import org.springframework.beans.factory.beans.factory.HierarchicalBeanFactory;

/**
 * @author derekyi
 * @date 2020/11/28
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

	/** 添加beanPostProcessor
	 * @param beanPostProcessor 添加beanPostProcessor
	 */
	void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}