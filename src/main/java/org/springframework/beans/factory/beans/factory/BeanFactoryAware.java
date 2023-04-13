package org.springframework.beans.factory.beans.factory;


import org.springframework.beans.factory.beans.BeansException;

/**
 * 实现该接口，能感知所属BeanFactory
 *
 * @author derekyi
 * @date 2020/12/1
 */
public interface BeanFactoryAware extends Aware {

	void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
