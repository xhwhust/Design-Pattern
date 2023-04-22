package decorator;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/22 14:32
 */
public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 = new SideBorder(
                new FullBorder(
                        new SideBorder(
                                new FullBorder(
                                        new StringDisplay("Welcome, friend")
                                ), '*'
                        )
                ), '/'
        );
        b4.show();

    }
}
