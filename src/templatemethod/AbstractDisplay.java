package templatemethod;

/**
 * describe 抽象类 AbstractDisplay
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName AbstractDisplay.java
 * @createTime 2019年07月09日 11:29:00
 */
public abstract class AbstractDisplay {
    // 交给子类去实现的抽象方法（1）open
    public abstract void open();
    // 交给子类去实现的抽象方法（2）print
    public abstract void print();
    // 交给子类去实现的抽象方法（3）close
    public abstract void close();
    // 本抽象法类中实现的display方法
    public final void display() {
        // 首先打开
        open();
        for (int i = 0; i < 5; i++) {
            // 循环调用5次print
            print();
        }
        // ......最后关闭。这就是display方法所实现的功能
        close();
    }
}
