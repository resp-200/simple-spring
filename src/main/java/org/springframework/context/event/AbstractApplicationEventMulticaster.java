package org.springframework.context.event;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import java.util.HashSet;
import java.util.Set;

/** 抽象的事件分发类，只实现事件监听器的添加删除等操作
 * @author: Zhang hao yu
 * @date: 2023/4/14
 **/
public abstract class AbstractApplicationEventMulticaster implements ApplicationEventMulticaster,
        BeanFactoryAware {
    public final Set<ApplicationListener<ApplicationEvent>> applicationListeners = new HashSet<>();
    private BeanFactory beanFactory;
    @Override
    public void addApplicationListener(ApplicationListener<?> listener) {
        this.applicationListeners.add((ApplicationListener<ApplicationEvent>) listener);
    }

    @Override
    public void removeApplicationListener(ApplicationListener<?> listener) {
        this.applicationListeners.remove( listener);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
