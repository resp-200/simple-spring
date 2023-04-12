package org.springframework.beans.factory.beans.factory.support;

import org.springframework.beans.factory.beans.BeansException;
import org.springframework.beans.factory.core.io.Resource;
import org.springframework.beans.factory.core.io.ResourceLoader;

/**
 * 读取bean定义信息即BeanDefinition的接口
 *
 * @author derekyi
 * @date 2020/11/26
 */
public interface BeanDefinitionReader {

	BeanDefinitionRegistry getRegistry();

	ResourceLoader getResourceLoader();

	// 获取bean的资源
	void loadBeanDefinitions(Resource resource) throws BeansException;

	void loadBeanDefinitions(String location) throws BeansException;

	void loadBeanDefinitions(String[] locations) throws BeansException;
}
