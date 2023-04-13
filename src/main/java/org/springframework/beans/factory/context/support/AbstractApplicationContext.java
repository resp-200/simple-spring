package org.springframework.beans.factory.context.support;

import org.springframework.beans.factory.beans.BeansException;
import org.springframework.beans.factory.beans.factory.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.context.ConfigurableApplicationContext;
import org.springframework.beans.factory.core.io.DefaultResourceLoader;

import java.util.Map;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/13
 **/
public abstract class AbstractApplicationContext extends DefaultResourceLoader implements ConfigurableApplicationContext {
    @Override
    public void refresh() throws BeansException {
        // 创建BeaFactory，加载BeanDefinition
        refreshBeanFactory();

        ConfigurableListableBeanFactory beanFactory = getBeanFactory();
        //在bean实例化之前，执行BeanFactoryPostProcessor
        invokeBeanFactoryPostProcessors(beanFactory);

        //BeanPostProcessor需要提前与其他bean实例化之前注册
        registerBeanPostProcessors(beanFactory);

        //提前实例化单例bean
        beanFactory.preInstantiateSingletons();
    }

    private void registerBeanPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        // 利用类型找出所有的BeanPostProcessor
        Map<String, BeanPostProcessor> beansOfType = beanFactory.getBeansOfType(BeanPostProcessor.class);
        for (BeanPostProcessor processor : beansOfType.values()) {
            // 注册到postProcessor集合中
            beanFactory.addBeanPostProcessor(processor);
        }
    }

    private void invokeBeanFactoryPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        // 利用类型找出所有的beanFactoryPostProcessor对象
        Map<String, BeanFactoryPostProcessor> beansOfType = beanFactory.getBeansOfType(BeanFactoryPostProcessor.class);
        for (BeanFactoryPostProcessor processor : beansOfType.values()) {
            processor.postProcessBeanFactory(beanFactory);
        }
    }

    protected abstract ConfigurableListableBeanFactory getBeanFactory();

    /**
     * 创建BeanFactory，并加载BeanDefinition
     *
     * @throws BeansException
     */
    protected abstract void refreshBeanFactory() throws BeansException;

    @Override
    public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
        return getBeanFactory().getBeansOfType(type);
    }

    @Override
    public Object getBean(String name) throws BeansException {
        return getBeanFactory().getBean(name);
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return getBeanFactory().getBeanDefinitionNames();
    }
}
