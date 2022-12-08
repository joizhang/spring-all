package com.joizhang.springpuzzle.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author joizhang
 */
public class SimpleMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("SimpleMethodInterceptor被调用: " + methodInvocation.getMethod().getName());
        return methodInvocation.proceed();
    }

}
