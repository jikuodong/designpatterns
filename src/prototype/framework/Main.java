package prototype.framework;

/**
 * describe 模型设计模式测试类
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Main.java
 * @createTime 2019年07月19日 10:43:00
 */
public class Main {
    public static void main(String[] args) {
        // 准备
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // 生成
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world");
        System.out.println(upen == p1);

    }
}
