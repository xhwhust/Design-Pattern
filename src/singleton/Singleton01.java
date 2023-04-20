package singleton;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/20 15:26
 * 静态变量初始化
 */

public class Singleton01 {

    private static Singleton01 instance = new Singleton01();

    public static Singleton01 getInstance() {
        return instance;
    }

}
