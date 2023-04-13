package org.springframework.test.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author derekyi
 * @date 2020/11/24
 */
public class Person implements InitializingBean, DisposableBean {

	private String name;

	private int age;

	private Car car;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", car=" + car +
				'}';
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("实现DisposableBean的销毁方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("实现initializingBean的初始化后的方法");
	}

	public void customInitMethod() {
		System.out.println("xml配置的初始化后的方法");
	}

	public void customDestroyMethod() {
		System.out.println("xml配置的销毁方法");
	}
}
