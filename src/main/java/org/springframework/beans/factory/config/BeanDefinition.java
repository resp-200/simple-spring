package org.springframework.beans.factory.config;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/10
 **/
public class BeanDefinition {
    private String beanClass;

    public BeanDefinition(String beanClass) {
        this.beanClass = beanClass;
    }

    public String getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(String beanClass) {
        this.beanClass = beanClass;
    }
}
