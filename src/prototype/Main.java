package prototype;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/20 15:34
 */
public class Main {
    public static void main(String[] args) {
        //准备
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", underlinePen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        //生成
        Product p1 = manager.create("strong message");
        Product p2 = manager.create("warning box");
        Product p3 = manager.create("slash box");
        p1.use("Hello, world.");
        p2.use("Hello, world.");
        p3.use("Hello, world.");

    }
}