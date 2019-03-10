package main.java.com.gupao.sourcecode.pattern.single;

/**
 * @ClassName 懒汉式单例(双重校验+volatile关键字实现线程安全)
 * @Description
 * @Author wangjianjun
 **/
public class SlackerSingleton {

    private SlackerSingleton(){}

    private volatile static SlackerSingleton slackerSingleton;

    public static SlackerSingleton newInstance(){
        if(slackerSingleton==null){
            synchronized (SlackerSingleton.class){
                if(slackerSingleton==null){
                    slackerSingleton=new SlackerSingleton();
                }
            }
        }
        return slackerSingleton;
    }

}
