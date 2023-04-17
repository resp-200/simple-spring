package org.springframework.test.expanding;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.bean.Car;

/**
 * @author derekyi
 * @date 2020/12/13
 */
public class PropertyPlaceholderConfigurerTest {

	@Test
	public void test() throws Exception {
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("classpath:property-placeholder-configurer.xml");

		Car car = applicationContext.getBean("car", Car.class);
		System.out.println(car);
	}
}
