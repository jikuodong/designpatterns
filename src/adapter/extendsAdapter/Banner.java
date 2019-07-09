package adapter.extendsAdapter;

/**
 * describe 实际情况（电源的比喻：交流100伏特）
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Banner.java
 * @createTime 2019年04月26日 13:14:00
 */
public class Banner {
    private String string ;
    public Banner(String string) {
        this.string = string;
    }
    public void showWithParen() {
        System.out.println("("+ string+")");
    }
    public void showWithAster() {
        System.out.println("*" +string + "*");
    }
}
