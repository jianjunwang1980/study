package main.java.com.gupao.sourcecode.pattern.proxy;

/**
 * @ClassName 动态代理测试类
 * @Description
 * @Author wangjianjun
 **/
public class ProxyTest {

    public static void main(String[] args) {
        Father father = (Father) new Agency().getInstance(new Son());
        father.findLove();
    }
}
