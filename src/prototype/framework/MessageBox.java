package prototype.framework;

/**
 * describe 实现Product接口
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName MessageBox.java
 * @createTime 2019年07月18日 18:13:00
 */
public class MessageBox implements  Product {
    private char decochar;
    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i<length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
