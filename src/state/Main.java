package state;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/23 14:14
 */
public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("state Sample");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        }
    }
}