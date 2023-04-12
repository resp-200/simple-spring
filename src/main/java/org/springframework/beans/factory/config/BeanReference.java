package org.springframework.beans.factory.config;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/12
 **/
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
