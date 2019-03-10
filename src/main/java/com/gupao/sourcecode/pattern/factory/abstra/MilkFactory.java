package main.java.com.gupao.sourcecode.pattern.factory.abstra;

import main.java.com.gupao.sourcecode.pattern.factory.Milk;
import main.java.com.gupao.sourcecode.pattern.factory.TeLunSu;
import main.java.com.gupao.sourcecode.pattern.factory.Yili;
import main.java.com.gupao.sourcecode.pattern.factory.func.TelunsuFactory;
import main.java.com.gupao.sourcecode.pattern.factory.func.YiliFactory;

public class MilkFactory extends AbstractFactory {
    @Override
    public Milk getYili() {
        return new Yili();
    }

    @Override
    public Milk getTeLunSu() {
        return new TeLunSu();
    }
}
