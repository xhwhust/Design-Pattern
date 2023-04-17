package iterator;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/17 22:01
 */
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf() ;
        bookShelf.appendBook(new Book("111"));
        bookShelf.appendBook(new Book("222"));
        bookShelf.appendBook(new Book("333"));
        bookShelf.appendBook(new Book("444"));
        bookShelf.appendBook(new Book("555"));

        Iterator iterator = bookShelf.iterator() ;
        while(iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }

}
