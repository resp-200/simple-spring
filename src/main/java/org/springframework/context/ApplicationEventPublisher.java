package org.springframework.context;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/14
 **/
public interface ApplicationEventPublisher {

    /**
     * 发布事件
     *
     * @param event
     */
    void publishEvent(ApplicationEvent event);
}
