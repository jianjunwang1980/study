package main.java.com.gupao.sourcecode.pattern.factory.abstra;

import main.java.com.gupao.sourcecode.pattern.factory.Milk;

/**
 * 面包工厂
 */
public interface BreadFactory {

    protected abstract Milk getMilk();

    public void test(){

    }



}
