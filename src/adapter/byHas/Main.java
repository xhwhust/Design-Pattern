package adapter.byHas;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/18 21:01
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("world") ;
        p.printWeak();
        p.printStrong();
    }
}
