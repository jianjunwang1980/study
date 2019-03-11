package main.java.com.gupao.sourcecode.pattern.prototype;

/**
 * @ClassName
 * @Description
 * @Author wangjianjun
 **/
public class Prototype implements Cloneable {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
