package main.java.com.gupao.sourcecode.pattern.factory;

import main.java.com.gupao.sourcecode.pattern.factory.abstra.MilkFactory;
import main.java.com.gupao.sourcecode.pattern.factory.func.Factory;
import main.java.com.gupao.sourcecode.pattern.factory.func.YiliFactory;
import main.java.com.gupao.sourcecode.pattern.factory.simple.SimpleFactory;

public class FactoryTest {

    public static void main(String[] args) {
        //简单工厂
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.getMilk("特仑苏"));

        //工厂方法
        Factory factory = new YiliFactory();
        System.out.println(factory.getMilk());

        //抽象工厂
        MilkFactory milkFactory = new MilkFactory();
        System.out.println(milkFactory.getTeLunSu());

    }
}
