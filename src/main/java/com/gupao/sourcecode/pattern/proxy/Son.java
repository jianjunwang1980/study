package main.java.com.gupao.sourcecode.pattern.proxy;

/**
 * @ClassName 被代理的实现类
 * @Description
 * @Author wangjianjun
 **/
public class Son implements Father {

    @Override
    @Transcation(name="姓名",value="值")
    public void findLove() {
        System.out.println("找对象");
    }
}
