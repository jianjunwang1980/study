package main.java.com.gupao.sourcecode.pattern.factory.abstra;

import main.java.com.gupao.sourcecode.pattern.factory.Bread;
import main.java.com.gupao.sourcecode.pattern.factory.Milk;

/**
 * 面包工厂
 */
public abstract class AbstractFactory {

    public abstract Milk getMilk();

    public abstract Bread getBread();

    public void doSomething(){

    }

}
