package iterator;

import java.util.ArrayList;

/**
 * describe
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName BookShelfByArrayList.java
 * @createTime 2019年04月25日 17:26:00
 */
public class BookShelfByArrayList implements Aggregate {
    private ArrayList <Book> arrayList;
    private int last = 0;

    public BookShelfByArrayList() {
        this.arrayList = new ArrayList<>();
    }

    public Book getBookAt(int index) {
        return arrayList.get(index);
    }

    public void appendBook(Book book) {
        this.arrayList.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIteratorByArrayList(this);
    }
}
