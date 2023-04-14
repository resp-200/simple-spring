package org.springframework.context;

import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.core.io.ResourceLoader;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/13
 **/
public interface ApplicationContext extends HierarchicalBeanFactory, ListableBeanFactory,
        ResourceLoader, ApplicationEventPublisher {

}
