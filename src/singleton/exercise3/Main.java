package singleton.exercise3;

/**
 * describe
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Main.java
 * @createTime 2019年07月04日 09:41:00
 */
public class Main extends Thread {

    public static void main(String[] args) {
        System.out.println("Start");
        new Main("A").start();
        new Main("B").start();
        new Main("C").start();
        System.out.println("End.");
    }

    @Override
    public void run() {
        Singleton obj = Singleton.getInstance();
        System.out.println(getName() + ": obj =" +obj);
    }

    public Main(String name) {
        super(name);
    }
}
