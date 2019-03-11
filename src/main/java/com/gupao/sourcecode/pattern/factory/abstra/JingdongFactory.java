package main.java.com.gupao.sourcecode.pattern.factory.abstra;

import main.java.com.gupao.sourcecode.pattern.factory.Milk;
import main.java.com.gupao.sourcecode.pattern.factory.Yili;

/**
 * @ClassName
 * @Description
 * @Author wangjianjun
 **/
public class HuameiFactory extends AbstractFactory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
