package main.java.com.gupao.sourcecode.pattern.factory.func;

import main.java.com.gupao.sourcecode.pattern.factory.Milk;
import main.java.com.gupao.sourcecode.pattern.factory.Yili;

public class YiliFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
