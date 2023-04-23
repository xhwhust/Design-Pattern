package observer;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/23 13:45
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObservers(observer1);
        generator.addObservers(observer2);
        generator.execute();
    }
}
