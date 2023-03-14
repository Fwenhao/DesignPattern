package cn.fyyice.designpattern.proxy.common;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ProxyObjClazz {

    public ProxyObjClazz(Object target) {
        this.target = target;
    }

    public Object target;


    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                // 目标对象的类加载器
                target.getClass().getClassLoader(),
                // 目标对象的接口类型
                target.getClass().getInterfaces(),
                // 事件处理器
                new InvocationHandler() {
                    /**
                     *
                     * @param o  代理对象
                     * @param method 代理对象调用的方法
                     * @param objects   代理对象调用方法时实际的参数
                     * @return
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        System.out.println("代理商前置增强");
                        Object invoke = method.invoke(target, objects);
                        System.out.println("代理商后置增强");
                        return invoke;
                    }
                }
        );
    }
}
