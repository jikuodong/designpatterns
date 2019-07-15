package singleton;

import java.io.IOException;
import java.io.InputStream;

/**
 * describe Singleton(单例) 模式main 方法
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Main.java
 * @createTime 2019年07月03日 09:46:00
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("start");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton1 == singleton2) {
            System.out.println("singleton1与singleton2是相同的实例！");
        } else {
            System.out.println("singleton1与singleton2不是相同的实例！");
        }
        System.out.println("end");
    }
}
