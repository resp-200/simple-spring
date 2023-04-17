package org.springframework.aop;

import org.aopalliance.intercept.MethodInterceptor;

/**
 *
 * 目标对象(target)：被增强的对象
 * 连接点(JoinPoint)：被增强方法的增强点，即被增强方法的before、after return、throw exception位置。
 * 通知(Advice)：增强逻辑
 * 切入点(Pointcut )：指定增强逻辑需要增强在哪个对象的哪个方法上。可以简单理解为pointcut = target + joinpoint。
 * 顾问(Advisor)：Advisor其实是Spring AOP代码结构上的概念，Advisor是Pointcut和Advice的封装，一个Advisor可以清楚的描述需要在哪个地方（Pointcut）进行什么增强（Advice）。Advisor = Pointcut + Advice。
 * 切面(Aspect)：相当于Advisor，也是Pointcut + Advice，另一种概念而已。一个切面能够清楚的描述需要在哪个地方（Pointcut）进行什么增强（Advice）。
 * 代理对象(Proxy)：最终生成的增强对象
 *
 * 作者：Chubxu
 * 链接：https://juejin.cn/post/7118310904634015780
 * 来源：稀土掘金
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @author derekyi
 * @date 2020/12/6
 */
public class AdvisedSupport {

    private TargetSource targetSource;

    private MethodInterceptor methodInterceptor;

    private MethodMatcher methodMatcher;

    //是否使用cglib代理
    private boolean proxyTargetClass = false;

    public boolean isProxyTargetClass() {
        return proxyTargetClass;
    }

    public void setProxyTargetClass(boolean proxyTargetClass) {
        this.proxyTargetClass = proxyTargetClass;
    }

    public TargetSource getTargetSource() {
        return targetSource;
    }

    public void setTargetSource(TargetSource targetSource) {
        this.targetSource = targetSource;
    }

    public MethodInterceptor getMethodInterceptor() {
        return methodInterceptor;
    }

    public void setMethodInterceptor(MethodInterceptor methodInterceptor) {
        this.methodInterceptor = methodInterceptor;
    }

    public MethodMatcher getMethodMatcher() {
        return methodMatcher;
    }

    public void setMethodMatcher(MethodMatcher methodMatcher) {
        this.methodMatcher = methodMatcher;
    }
}
