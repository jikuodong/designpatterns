package templatemethod;

/**
 * describe 测试类
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Main.java
 * @createTime 2019年07月09日 16:23:00
 */
public class Main {
    public static void main(String[] args) {
        // 生成一个持有‘H’的CharDisplay类的实例
        AbstractDisplay d1 = new CharDisplay('H');
        // 生成一个持有“Hello, word.”的StringDisplay类的实例
        AbstractDisplay d2 = new StringDisplay("Hello, word.");
        // 生成一个持有“你好， 世界。”的StringDisplay类的实例
        AbstractDisplay d3 = new StringDisplay("你好， 世界。");
        d1.display();
        d2.display();
        d3.display();
    }

}
