package org.springframework.context.support;

import org.springframework.beans.BeansException;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/13
 **/
public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext{
    private String[] configLocations;

    /**
     * 从xml文件加载BeanDefinition，并且自动刷新上下文
     *
     * @param configLocation xml配置文件
     * @throws BeansException 应用上下文创建失败
     */
    public ClassPathXmlApplicationContext(String configLocation) throws BeansException {
        this(new String[]{configLocation});
    }


    /**
     * 从xml文件加载BeanDefinition，并且自动刷新上下文
     *
     * @param configLocations xml配置文件
     * @throws BeansException 应用上下文创建失败
     */
    public ClassPathXmlApplicationContext(String[] configLocations) throws BeansException {
        this.configLocations = configLocations;
        // 刷新上下文
        refresh();
    }
    @Override
    protected String[] getConfigLocations() {
        return this.configLocations;
    }
}
