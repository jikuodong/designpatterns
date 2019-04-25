package iterator;

/**
 * describe 书的类
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Book.java
 * @createTime 2019年04月25日 15:34:00
 */
public class Book {
    private  String name;

    public Book (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
