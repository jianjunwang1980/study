package main.java.com.gupao.sourcecode.pattern.single;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

/**
 * @ClassName
 * @Description
 * @Author wangjianjun
 **/
public class SingleTest {

    public static void main(String[] args) throws InterruptedException {
//        EnumSingleton singleton = EnumSingleton.newInstance();
//        System.out.println(singleton);


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ContainerSingleton singleton = (ContainerSingleton) ContainerSingleton.getBean("main.java.com.gupao.sourcecode.pattern.single.ContainerSingleton");
                System.out.println(singleton);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ContainerSingleton singleton = (ContainerSingleton) ContainerSingleton.getBean("main.java.com.gupao.sourcecode.pattern.single.ContainerSingleton");
                System.out.println(singleton);
            }
        });

        t1.start();
        t2.start();

        //判断序列化和反序列化是否破坏单例
//        ContainerSingleton singleton1 = (ContainerSingleton) ContainerSingleton.getBean("main.java.com.gupao.sourcecode.pattern.single.ContainerSingleton");
//        ContainerSingleton singleton2 = null;
//        try {
//            FileOutputStream fos = new FileOutputStream("e:\\singleton.obj");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(singleton1);
//
//            oos.close();
//            fos.close();
//
//            FileInputStream fis=new FileInputStream("e:\\singleton.obj");
//            ObjectInputStream ois=new ObjectInputStream(fis);
//            singleton2=(ContainerSingleton)ois.readObject();
//            ois.close();
//            fis.close();
//            System.out.println(singleton1==singleton2);
//        }catch(Exception e){
//            e.printStackTrace();
//        }


        //判断反射是否破坏单例
        //ContainerSingleton singleton = (ContainerSingleton) ContainerSingleton.getBean("main.java.com.gupao.sourcecode.pattern.single.ContainerSingleton");

    }
}
