package iterator.concrete_aggregate;

import iterator.aggregate.Collectiona;
import iterator.concrete_iterator.BookShelfIterator;
import iterator.item.Book;
import iterator.iterator.Iterator;


/**
 * Created by bnpinnovation on 2016. 8. 17..
 */
public class BookShelf implements Collectiona {
    private Book[] books;

    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        return new BookShelfIterator(this);
    }
}
