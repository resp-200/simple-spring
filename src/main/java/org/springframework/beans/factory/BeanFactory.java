package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

import java.util.HashMap;
import java.util.Map;

/** bean工厂，获取bean
 * @author derekyi
 * @date 2020/11/22
 */
public interface BeanFactory {

	Object getBean(String name);

	<T> T getBean(String name,Class<T> requiredType) throws BeansException;
}
