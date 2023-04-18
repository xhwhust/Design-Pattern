package adapter.byExtend;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/18 20:56
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello") ;
        p.printWeak();
        p.printStrong();
    }
}
