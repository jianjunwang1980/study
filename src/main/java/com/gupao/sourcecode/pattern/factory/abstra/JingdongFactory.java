package main.java.com.gupao.sourcecode.pattern.factory.abstra;

import main.java.com.gupao.sourcecode.pattern.factory.Bread;
import main.java.com.gupao.sourcecode.pattern.factory.Daliyuan;
import main.java.com.gupao.sourcecode.pattern.factory.Milk;
import main.java.com.gupao.sourcecode.pattern.factory.Yili;

/**
 * @ClassName
 * @Description
 * @Author wangjianjun
 **/
public class JingdongFactory extends AbstractFactory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }

    @Override
    public Bread getBread() {
        return new Daliyuan();
    }
}
