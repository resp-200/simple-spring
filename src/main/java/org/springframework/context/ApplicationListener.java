package org.springframework.context;

import java.util.EventListener;

/**
 * @author derekyi
 * @date 2020/12/2
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

	/** 事件监听接口
	 * @param event
	 */
	void onApplicationEvent(E event);
}