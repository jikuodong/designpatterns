package singleton.exercise1;

/**
 * describe 联系测试
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Main.java
 * @createTime 2019年07月03日 10:19:00
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i<10; i++) {
            System.out.println(i+ ":" +TicketMaker.getInstance().getNextTicketMaker());
        }
        System.out.println("End.");
    }
}
