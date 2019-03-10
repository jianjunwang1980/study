package main.java.com.gupao.sourcecode.pattern.factory.simple;


import main.java.com.gupao.sourcecode.pattern.factory.Milk;
import main.java.com.gupao.sourcecode.pattern.factory.TeLunSu;
import main.java.com.gupao.sourcecode.pattern.factory.Yili;

public class SimpleFactory {

    public Milk getMilk(String name) {
        if ("特仑苏".equals(name)) {
            return new TeLunSu();
        } else if ("伊利".equals(name)) {
            return new Yili();
        }
        return null;
    }
}
