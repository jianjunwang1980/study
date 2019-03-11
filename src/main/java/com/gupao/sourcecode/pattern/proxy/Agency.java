package main.java.com.gupao.sourcecode.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName 动态代理类
 * @Description
 * @Author wangjianjun
 **/
public class Agency implements InvocationHandler {

    private Father father;

    public Object getInstance(Father father) {
        System.out.println("进入getInstance");
        this.father = father;
        Class clazz = father.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在invoke方法中做前置和后置的操作
        System.out.println("开始执行invoke");
        method.invoke(father, args);
        System.out.println(father.getClass().getMethod("findLove").getAnnotation(Transcation.class));
        //System.out.println("获取注解" + father.getClass().getMethod("findLove").getAnnotation(Transcation.class).name());
        System.out.println("invoke执行结束");
        return null;
    }
}
