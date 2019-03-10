package main.java.com.gupao.sourcecode.pattern.single;

/**
 * @ClassName 枚举单例
 * @Description
 * @Author wangjianjun
 **/
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public static EnumSingleton newInstance(){
        return INSTANCE;
    }

}
