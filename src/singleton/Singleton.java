package singleton;

/**
 * describe 单例模式
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Singleton.java
 * @createTime 2019年07月03日 09:44:00
 */
public class Singleton {

    private static  Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("生成一个实例。");
    }

    public static Singleton getInstance() {
        return singleton;
    }

}
