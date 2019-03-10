package main.java.com.gupao.sourcecode.pattern.single;

/**
 * @ClassName
 * @Description
 * @Author wangjianjun
 **/
public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {
    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton newInstance() {
        return threadLocal.get();
    }
}
