package main.java.com.gupao.sourcecode.pattern.strategy;

/**
 * @ClassName
 * @Description
 * @Author wangjianjun
 **/
public class CardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("银联卡支付");
    }
}
