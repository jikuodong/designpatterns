package singleton.exercise1;

/**
 * describe 在下面的Ticketmaker类中，每次调用getNextTicketmaker方法都会返回1000,1001,1002。。。的数列。
 * 我们可以用它生成票的编号或是其他序列号。在现在该类的实现方式下，我们可以生成多个该类的实例。
 * 请修改代码，运用Singleton模式确保只能生成一个该类的实例。
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName TicketMaker.java
 * @createTime 2019年07月03日 10:09:00
 */
public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker ticketMaker = new TicketMaker();
    private TicketMaker(){}

    public static TicketMaker getInstance() {
        return ticketMaker;
    }
    // 请注意getNextTicketMaker方法是synchronized方法，这是为了能让getNextTicketMaker在多线程环境下正常工作。
    public synchronized int getNextTicketMaker() {
        return ticket++;
    }
}
