package org.springframework.beans.factory.context;


import org.springframework.beans.factory.beans.BeansException;

/**
 * @author derekyi
 * @date 2020/11/28
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

	/**
	 * 刷新容器
	 *
	 * @throws BeansException
	 */
	void refresh() throws BeansException;
}
