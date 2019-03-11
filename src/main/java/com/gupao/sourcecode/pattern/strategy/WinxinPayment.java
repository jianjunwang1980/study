package main.java.com.gupao.sourcecode.pattern.strategy;

/**
 * @ClassName
 * @Description
 * @Author wangjianjun
 **/
public class WinxinPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}