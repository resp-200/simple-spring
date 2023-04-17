package org.springframework.aop;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/17
 **/
public interface PointcutAdvisor extends Advisor{

    /** 获取切点
     * @return 切点
     */
    Pointcut getPointcut();

}
