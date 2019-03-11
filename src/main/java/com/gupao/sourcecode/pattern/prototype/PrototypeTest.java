package main.java.com.gupao.sourcecode.pattern.prototype;

/**
 * @ClassName
 * @Description
 * @Author wangjianjun
 **/
public class PrototypeTest {
    public static void main(String[] args) {
        Prototype prototype=new Prototype();
        prototype.setAge(20);
        prototype.setName("张三");

        Prototype prototype2= null;
        try {
            prototype2 = (Prototype)prototype.clone();
            System.out.println(prototype.getAge()==prototype2.getAge());
            System.out.println(prototype.getName()==prototype2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
