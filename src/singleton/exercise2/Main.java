package singleton.exercise2;

/**
 * describe
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Main.java
 * @createTime 2019年07月03日 14:57:00
 */
public class Main   {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 9; i++) {
            Triple triple = Triple.getInstance(i % 3);
            System.out.println(i + ":" +triple);
        }
        System.out.println("End.");
    }
}
