package factorymethod.exercise2;


import factorymethod.exercise2.framework.Factory;
import factorymethod.exercise2.framework.Product;
import factorymethod.exercise2.idcard.IDCardFactory;

/**
 * describe 测试类
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Main.java
 * @createTime 2019年07月18日 11:46:00
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
    }
}
