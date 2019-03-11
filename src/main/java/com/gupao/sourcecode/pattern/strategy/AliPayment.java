package main.java.com.gupao.sourcecode.pattern.strategy;

/**
 * @ClassName
 * @Description
 * @Author wangjianjun
 **/
public class AliPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
