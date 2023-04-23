package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/23 13:55
 */
// 记录主人公的状态
public class Memento {
    int money;
    ArrayList<String> fruits;

    Memento(int money) {
        this.money = money;
        fruits = new ArrayList<>();
    }

    void addFruits(String fruit) {
        fruits.add(fruit);
    }

    public int getMoney() {
        return money;
    }

    List<String> getFruits() {
        return (List<String>) fruits.clone();
    }
}
