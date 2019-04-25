package iterator;

/**
 * describe 遍历书架的类
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName BookShelfIterator.java
 * @createTime 2019年04月25日 15:54:00
 */
public class BookShelfIteratorByArrayList implements Iterator {
    private BookShelfByArrayList bookShelfByArrayList;
    private int index;

    public BookShelfIteratorByArrayList(BookShelfByArrayList bookShelfByArrayList) {
        this.bookShelfByArrayList = bookShelfByArrayList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelfByArrayList.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelfByArrayList.getBookAt(index);
        index++;
        return book;
    }
}
