package org.springframework.test.aop;

import org.junit.Test;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.test.service.HelloService;

import java.lang.reflect.Method;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/17
 **/
public class PointcutExpressionTest {

    @Test
    public void pointcutExpression() throws NoSuchMethodException {
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut("execution(* org.springframework.test.service.HelloService.*(..))");
        Class<HelloService> helloServiceClass = HelloService.class;
        Method sayHello = helloServiceClass.getDeclaredMethod("sayHello");
        aspectJExpressionPointcut.matches(helloServiceClass);

        assert aspectJExpressionPointcut.matches(helloServiceClass);

        assert aspectJExpressionPointcut.matches(sayHello,helloServiceClass);
    }
}
