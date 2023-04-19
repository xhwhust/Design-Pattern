package templateMethod;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/19 19:16
 */
public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
