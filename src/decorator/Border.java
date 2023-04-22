package decorator;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/22 14:30
 */

// 装饰边框的抽象类，装饰边框和被装饰物具有相同的方法
public abstract class Border extends Display {
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}