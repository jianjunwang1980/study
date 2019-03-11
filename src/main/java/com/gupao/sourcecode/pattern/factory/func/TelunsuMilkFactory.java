package main.java.com.gupao.sourcecode.pattern.factory.func;

import main.java.com.gupao.sourcecode.pattern.factory.Milk;
import main.java.com.gupao.sourcecode.pattern.factory.TeLunSu;

public class TelunsuMilkFactory implements MilkFactory {
    @Override
    public Milk getMilk() {
        return new TeLunSu();
    }
}
