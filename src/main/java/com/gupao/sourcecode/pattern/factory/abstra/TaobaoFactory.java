package main.java.com.gupao.sourcecode.pattern.factory.abstra;

import main.java.com.gupao.sourcecode.pattern.factory.Milk;
import main.java.com.gupao.sourcecode.pattern.factory.TeLunSu;

/**
 * @ClassName
 * @Description
 * @Author wangjianjun
 **/
public class DaliyuanFactory extends AbstractFactory {
    @Override
    public Milk getMilk() {
        return new TeLunSu();
    }

}
