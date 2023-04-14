package org.springframework.context.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author derekyi
 * @date 2020/12/5
 */
public interface ApplicationEventMulticaster {

	void addApplicationListener(ApplicationListener<?> listener);

	void removeApplicationListener(ApplicationListener<?> listener);

	/** 事件广播发布
	 * @param event
	 */
	void multicastEvent(ApplicationEvent event);

}
