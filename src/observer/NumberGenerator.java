package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/23 13:41
 */
public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<>();

    public void addObservers(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    // 向 Observer 发生通知
    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
            Observer o = it.next();
            o.update(this);
        }
    }

    //获取数值
    public abstract int getNumber();

    //生成数值
    public abstract void execute();
}
