package org.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/17
 **/
public interface Advisor {

    /** 获取通知
     * @return 通知
     */
    Advice getAdvice();
}
