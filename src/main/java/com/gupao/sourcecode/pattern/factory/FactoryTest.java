package main.java.com.gupao.sourcecode.pattern.factory;

import main.java.com.gupao.sourcecode.pattern.factory.abstra.AbstractFactory;
import main.java.com.gupao.sourcecode.pattern.factory.abstra.JingdongFactory;
import main.java.com.gupao.sourcecode.pattern.factory.abstra.TaobaoFactory;
import main.java.com.gupao.sourcecode.pattern.factory.func.MilkFactory;
import main.java.com.gupao.sourcecode.pattern.factory.func.YiliMilkFactory;
import main.java.com.gupao.sourcecode.pattern.factory.simple.SimpleFactory;

public class FactoryTest {

    public static void main(String[] args) {
        //简单工厂
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.getMilk("特仑苏"));

        //工厂方法
        MilkFactory milkFactory = new YiliMilkFactory();
        System.out.println(milkFactory.getMilk());

        //抽象工厂
        AbstractFactory jingdong = new JingdongFactory();
        System.out.println(jingdong.getMilk().getName());
        System.out.println(jingdong.getBread().getName());

        AbstractFactory taobao = new TaobaoFactory();
        System.out.println(taobao.getMilk().getName());
        System.out.println(taobao.getBread().getName());

    }
}
