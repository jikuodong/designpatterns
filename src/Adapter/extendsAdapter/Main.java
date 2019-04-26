package Adapter.extendsAdapter;

/**
 * describe 使用者
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Main.java
 * @createTime 2019年04月26日 13:38:00
 */
public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("Hello");
        print.printStrong();
        print.printWeak();
    }
}
