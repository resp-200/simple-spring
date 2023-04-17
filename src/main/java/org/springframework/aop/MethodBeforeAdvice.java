package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/17
 **/
public interface MethodBeforeAdvice extends BeforeAdvice{

    void before(Method method, Object[] args, Object target) throws Throwable;
}
