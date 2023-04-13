package org.springframework.beans.factory.context;

import org.springframework.beans.factory.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.core.io.ResourceLoader;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/13
 **/
public interface ApplicationContext extends HierarchicalBeanFactory, ListableBeanFactory, ResourceLoader {

}
