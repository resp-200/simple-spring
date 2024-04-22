package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author Zhang hao yu
 * @Date 2024/4/22 15:01
 */
public class BeanFactory {
    private final Map<String, Object> beanMap = new HashMap<>();

    public void registerBean(String name, Object bean) {
        beanMap.put(name, bean);
    }

    public Object getBean(String name) {
        return beanMap.get(name);
    }
}
