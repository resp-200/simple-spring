package org.springframework.beans.factory.context.support;

import org.springframework.beans.factory.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/13
 **/
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {
    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (configLocations != null) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}
