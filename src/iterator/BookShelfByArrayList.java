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

    public BookShelfByArrayList(int initialsize) {
        this.arrayList = new ArrayList<>(initialsize);
    }

    public Book getBookAt(int index) {
        return arrayList.get(index);
    }

    public void appendBook(Book book) {
        this.arrayList.add(book);
    }

    public int getLength() {
        return arrayList.size();
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIteratorByArrayList(this);
    }
}
