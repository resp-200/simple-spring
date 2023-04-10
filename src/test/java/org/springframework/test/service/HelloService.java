package org.springframework.test.service;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/10
 **/
public class HelloService {
    public String sayHello() {
        System.out.println("hello");
        return "hello";
    }
}
