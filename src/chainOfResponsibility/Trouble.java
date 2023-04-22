package chainOfResponsibility;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/22 15:15
 */

// 问题类，具有问题编号，编号是职责链处理的依据
public class Trouble {
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[Trouble " + number + "]";
    }
}
