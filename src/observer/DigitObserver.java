package observer;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/23 13:42
 */

// 以数字形式显示观察到的数值
public class DigitObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver: " + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }
}
