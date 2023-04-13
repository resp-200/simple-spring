package org.springframework.beans.factory.beans.factory;


import org.springframework.beans.factory.beans.BeansException;
import org.springframework.beans.factory.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author derekyi
 * @date 2020/11/28
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory,
		AutowireCapableBeanFactory,
		ConfigurableBeanFactory {

	/**
	 * 根据名称查找BeanDefinition
	 *
	 * @param beanName
	 * @return
	 * @throws BeansException 如果找不到BeanDefintion
	 */
	BeanDefinition getBeanDefinition(String beanName) throws BeansException;

	/**
	 * 提前实例化所有单例实例
	 *
	 * @throws BeansException
	 */
	void preInstantiateSingletons() throws BeansException;
}
