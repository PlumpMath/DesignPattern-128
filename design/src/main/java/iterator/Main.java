package iterator;

import iterator.concrete_aggregate.BookShelf;
import iterator.item.Book;
import iterator.iterator.Iterator;

import java.util.List;

/**
 * Created by bnpinnovation on 2016. 8. 17..
 */
public class Main {
    // Data set과 저장 공간의 분리
    // 그 예로 Collection, Map Interface 객체에서 iterator() 를 호출할 수 있음.
    // External or active iterators are controlled by the client
    // (for example, Java's Iterator class).
    //
    // Internal or passive iterators are controlled by the aggregate object.
    // A tree may have a traverse- PostOrder() method that's passed
    // a Cormrand object that is, in turn
    public static void main(String[] ar) {
// TODO Auto-generated method stub
        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBook(new Book("Around the world in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        List<String> list;

        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = (Book) it.next();

            System.out.println(book.getName());
        }
    }
}
