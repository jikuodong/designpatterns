package iterator;

/**
 * describe 测试程序行为的类
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Main.java
 * @createTime 2019年04月25日 16:17:00
 */
public class Main {
    public static void main(String[] args) {
        // 数组方式
        /*BookShelf bookShelf =  new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = new BookShelfIterator(bookShelf);*/
       // ArrayList
        BookShelfByArrayList bookShelfByArrayList =  new BookShelfByArrayList(4);
        bookShelfByArrayList.appendBook(new Book("Around the World in 80 Days"));
        bookShelfByArrayList.appendBook(new Book("Bible"));
        bookShelfByArrayList.appendBook(new Book("Cinderella"));
        bookShelfByArrayList.appendBook(new Book("Daddy-Long-Legs"));
        bookShelfByArrayList.appendBook(new Book("Daddy-Long-Legs1"));
        Iterator it = new BookShelfIteratorByArrayList(bookShelfByArrayList);
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
