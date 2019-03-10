package main.java.com.gupao.sourcecode.pattern.single;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName 容器单例模式
 * @Description
 * @Author wangjianjun
 **/
public class ContainerSingleton implements Serializable {

    private ContainerSingleton() {}

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                    ;
                }
                return obj;
            }
        }
        return ioc.get(className);
    }

}
