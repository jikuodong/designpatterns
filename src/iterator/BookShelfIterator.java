package iterator;

/**
 * describe 遍历书架的类
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName BookShelfIterator.java
 * @createTime 2019年04月25日 15:54:00
 */
public class BookShelfIterator  implements Iterator {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator (BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
