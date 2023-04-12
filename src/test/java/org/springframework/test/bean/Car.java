package org.springframework.test.bean;

/**
 * @author derekyi
 * @date 2020/11/24
 */
public class Car {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				'}';
	}
}
