package org.springframework.beans.factory.config;


import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.util.StringValueResolver;

/**
 * @author derekyi
 * @date 2020/11/28
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

	/** 添加beanPostProcessor
	 * @param beanPostProcessor 添加beanPostProcessor
	 */
	void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

	/**
	 * 销毁bean
	 */
    void destroySingletons();

	void addEmbeddedValueResolver(StringValueResolver valueResolver);

	String resolveEmbeddedValue(String value);
}
