package org.springframework.beans.factory.beans.factory;

import java.util.HashMap;
import java.util.Map;

/** bean工厂，获取bean
 * @author derekyi
 * @date 2020/11/22
 */
public interface BeanFactory {

	Object getBean(String name);
}
