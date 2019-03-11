package main.java.com.gupao.sourcecode.pattern.strategy;

/**
 * @ClassName
 * @Description
 * @Author wangjianjun
 **/
public class StrategyTest {

    public static void main(String[] args) {
        Order order = new Order(new CardPayment());
        order.pay();
    }

}
