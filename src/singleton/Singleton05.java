package singleton;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/20 15:57
 * 静态内部类
 */
public class Singleton05 {
    private static Singleton05 instance;

    // 内部类属于被动引用，只有在被调用时才会进行类的加载
    // 类的加载是线程安全的，只会被加载一次
    // 缺点是无法传递参数
    private static class SingletonInstance {
        private static Singleton05 INSTANCE = new Singleton05();
    }

    public static Singleton05 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
