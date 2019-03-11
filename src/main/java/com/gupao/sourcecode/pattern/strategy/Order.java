package main.java.com.gupao.sourcecode.pattern.strategy;

/**
 * @ClassName 订单
 * @Description
 * @Author wangjianjun
 **/
public class Order {

    private Payment payment;

    public Order(){}

    public Order(Payment payment){
        this.payment=payment;
    }

    public void pay(){
        payment.pay();
    }
}
