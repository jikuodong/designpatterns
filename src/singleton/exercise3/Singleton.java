package singleton.exercise3;

/**
 * describe
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Singletom.java
 * @createTime 2019年07月04日 09:36:00
 */
public class Singleton{
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("生成了一个实例。");
        slowdown();
    }

    /**
     * describe 注意添加“synchronized”同步，防止多线程生成多个实例
     *
     * @method getInstance
     * @author JKD
     * @return singleton.exercise3.Singleton
     * @data 2019/7/4 10:15
     */
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
