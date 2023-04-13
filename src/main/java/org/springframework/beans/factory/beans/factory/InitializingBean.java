package org.springframework.beans.factory.beans.factory;

/**
 * @author derekyi
 * @date 2020/11/29
 */
public interface InitializingBean {

	void afterPropertiesSet() throws Exception;
}
