package strategy;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/21 17:15
 */
public interface Strategy {
    Hand nextHand();

    //根据上一局输赢进行学习
    void study(boolean win);
}
