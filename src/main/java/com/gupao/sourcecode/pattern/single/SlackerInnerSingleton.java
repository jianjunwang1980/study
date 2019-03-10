package main.java.com.gupao.sourcecode.pattern.single;

/**
 * @ClassName 注册式单例
 * @Description
 * @Author wangjianjun
 **/
public class SlackerInnerSingleton {

    private SlackerInnerSingleton() {
        if (RegisterInnerSingleton.SINGLETON != null) { //解决反射破坏单例的问题
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static SlackerInnerSingleton newInstance() {
        return RegisterInnerSingleton.SINGLETON;
    }

    private static class RegisterInnerSingleton {
        private static final SlackerInnerSingleton SINGLETON = new SlackerInnerSingleton();
    }

    private Object readResolve(){   //解决序列化和反序列化破坏单例
        return RegisterInnerSingleton.SINGLETON;
    }

}
