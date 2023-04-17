package iterator;

import java.util.ArrayList;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/17 21:56
 */
public class BookShelf implements Aggregate{
    private ArrayList<Book> books ;

    public BookShelf(){
        this.books = new ArrayList<>() ;
    }

    public Book getBookAt(int index){
        return books.get(index) ;
    }

    public void appendBook(Book book){
        books.add(book) ;
    }

    public int getLength(){
        return books.size() ;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this) ;
    }
}
