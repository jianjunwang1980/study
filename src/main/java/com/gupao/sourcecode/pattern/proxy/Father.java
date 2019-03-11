package main.java.com.gupao.sourcecode.pattern.proxy;

/**
 * @ClassName 被代理的接口
 * @Description
 * @Author wangjianjun
 **/
public interface Father {

    @Transcation(name="姓名",value="值")
    void findLove();

}
