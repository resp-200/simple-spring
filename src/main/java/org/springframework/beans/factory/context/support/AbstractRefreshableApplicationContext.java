package org.springframework.beans.factory.context.support;

import org.springframework.beans.factory.beans.BeansException;
import org.springframework.beans.factory.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/13
 **/
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext{

    private DefaultListableBeanFactory beanFactory;
    /**
     * 创建beanFactory并加载BeanDefinition
     *
     * @throws BeansException
     */
    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;

    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    @Override
    public DefaultListableBeanFactory getBeanFactory() {
        return beanFactory;
    }

}
