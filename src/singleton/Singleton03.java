package singleton;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/20 15:50
 * 饿汉式
 */
public class Singleton03 {

    private static Singleton03 instance;

    // 线程不安全
    public static Singleton03 getInstance() {
        if(instance == null) {
            instance = new Singleton03();
        }

        return instance;
    }

    // 线程安全
    public static synchronized Singleton03 getInstanceSafe() {
        if(instance == null) {
            instance = new Singleton03();
        }

        return instance;
    }

}
