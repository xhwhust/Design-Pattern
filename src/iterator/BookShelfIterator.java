package iterator;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/17 21:58
 */
public class BookShelfIterator implements Iterator{

    private BookShelf bookShelf ;
    private int index = 0 ;

    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf ;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength() ;
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index) ;
        index++ ;
        return book ;
    }
}
