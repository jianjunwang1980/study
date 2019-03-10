package main.java.com.gupao.sourcecode.pattern.single;

/**
 * @ClassName 饿汉式单例模式
 * @Description
 * @Author wangjianjun
 **/
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
    }

    public static HungrySingleton newInstance() {
        return hungrySingleton;
    }

}
