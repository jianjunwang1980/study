package main.java.com.gupao.sourcecode.pattern.factory.abstra;

import main.java.com.gupao.sourcecode.pattern.factory.Bread;
import main.java.com.gupao.sourcecode.pattern.factory.Huamei;
import main.java.com.gupao.sourcecode.pattern.factory.Milk;
import main.java.com.gupao.sourcecode.pattern.factory.TeLunSu;

/**
 * @ClassName
 * @Description
 * @Author wangjianjun
 **/
public class TaobaoFactory extends AbstractFactory {
    @Override
    public Milk getMilk() {
        return new TeLunSu();
    }

    @Override
    public Bread getBread() {
        return new Huamei();
    }

}
