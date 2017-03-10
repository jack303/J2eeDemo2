/*
package com.hwadee.service.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

*/
/**
 * Created by localdomain on 2017/3/9.
 *//*

public class CommonServiceImplProxy {
    public <T> T getObject(Class<T> tClass){
        try {
            T t =tClass.newInstance();
            Proxy.newProxyInstance(tClass.getClassLoader(), tClass.getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    method.invoke(t,)
                    return null;
                }
            });
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    };
}
*/
